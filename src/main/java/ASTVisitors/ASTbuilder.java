package ASTVisitors;

import ASTNodes.*;
import antlr.GrammarParser;
import antlr.GrammarVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

import static java.lang.Integer.parseInt;

public class ASTbuilder implements GrammarVisitor<ASTNode> {

    @Override
    public ASTNode visitS(GrammarParser.SContext ctx) {
        List<ASTNode> importer = new ArrayList<>();
        List<ASTNode> dcl = new ArrayList<>();
        ASTNode cmdStmt = null;
        ASTNode gameLoop = null;

        if (ctx.importStmt() != null) {
            for (int i = 0; i < ctx.importStmt().size(); i++) {
                importer.add(ctx.importStmt(i).accept(this));
            }
        }
        if (ctx.dcl() != null) {
            for (int i = 0; i < ctx.dcl().size(); i++) {
                dcl.add(ctx.dcl(i).accept(this));
            }
        }
        if (ctx.cmdStmt() != null) {
            cmdStmt = ctx.cmdStmt().accept(this);
        }
        if (ctx.gameLoop() != null) {
            gameLoop = ctx.gameLoop().accept(this);
        }
        return new SNode(importer, dcl, cmdStmt, gameLoop);
    }

    @Override
    public ASTNode visitDcl(GrammarParser.DclContext ctx) {

        ASTNode player = null;
        ASTNode level = null;
        ASTNode entity = null;

        if(ctx.playerDcl() != null) {
            player = ctx.playerDcl().accept(this);
        }
        if (ctx.levelDcl() != null) {
            level =  ctx.levelDcl().accept(this);
        }
        if (ctx.entityDcl() != null) {
            entity = ctx.entityDcl().accept(this);
        }
        return new DclNode(player, level, entity);
    }

    @Override
    public ASTNode visitImportStmt(GrammarParser.ImportStmtContext ctx) {
        String importVar = ctx.Import().getText();
        String importID = ctx.ID().getText();
        String importFileType = ctx.FileType().getText();

        return new ImportStmtNode(importVar, importID, importFileType);
    }

    @Override
    public ASTNode visitCmdStmt(GrammarParser.CmdStmtContext ctx) {
        String command = ctx.Command().getText();
        ArrayList<String> actions = new ArrayList<>();

        for (int i = 0; i < ctx.Actions().size(); i++) {
            actions.add(ctx.Actions(i).toString());
        }
        return new CmdStmtNode(command, actions);
    }

    @Override
    public ASTNode visitIterativeStmt(GrammarParser.IterativeStmtContext ctx) {

        ArrayList<ASTNode> controlStmt = new ArrayList<>();
        String forLoop = ctx.For().getText();
        String tile = ctx.Tile().getText();
        String tiles = ctx.Tiles().getText();

        if (ctx.controlStmt() != null) {
            for(int i = 0; i < ctx.controlStmt().size(); i++) {
                controlStmt.add(ctx.controlStmt(i).accept(this));
            }
        }
        return new IterativeStmtNode(forLoop, tile, tiles, controlStmt);
    }

    @Override
    public ASTNode visitControlStmt(GrammarParser.ControlStmtContext ctx) {
        if (ctx.placement().size() <= 1 && ctx.bexpr() != null){
            ctx.bexpr().accept(this);
            ctx.placement().get(0).accept(this);
        }
        else {
            ctx.bexpr().accept(this);
            ctx.placement().get(0).accept(this);
            ctx.placement().get(1).accept(this);
        }

        return null;
    }

    @Override
    public ASTNode visitPlayerDcl(GrammarParser.PlayerDclContext ctx) {
        if (ctx.attr() != null) {
            return new PlayerDclNode(ctx.Player().getText(), ctx.attr().get(0).accept(this));
        }

        return null;
    }

    @Override
    public ASTNode visitAttr(GrammarParser.AttrContext ctx) {
        if(ctx.Lives() != null){
            return new AttrNode(Integer.parseInt(ctx.DIGIT().getText()));
        }

        return null;
    }

    @Override
    public ASTNode visitLevelDcl(GrammarParser.LevelDclContext ctx) {
        List<ASTNode> levels = new ArrayList<>();
        if (ctx.LevelDesign() != null) {
            for (int i = 0; i < ctx.levels().size(); i++) {
                levels.add(ctx.levels(i).accept(this));
            }
            return new LevelDclNode(ctx.LevelDesign().getText(), levels);
        }

        return null;
    }

    @Override
    public ASTNode visitLevels(GrammarParser.LevelsContext ctx) {
        List<ASTNode> placements = new ArrayList<>();
        ASTNode size;
        String levelName = ctx.levelName().getText();


        if (ctx.levelName() != null && ctx.size() != null) {
            size = ctx.size().accept(this);
            if (ctx.placement().size() <= 1) {
                for (int i = 0; i < ctx.placement().size(); i++){
                    placements.add(ctx.placement(i).accept(this));
                }
            }

            return new LevelNode(levelName, size, placements);
        }
        return null;
    }

    @Override
    public ASTNode visitSize(GrammarParser.SizeContext ctx) {
        return new SizeNode(Integer.parseInt(ctx.DIGIT(0).getText()), Integer.parseInt(ctx.DIGIT(1).getText()));
    }

    @Override
    public ASTNode visitPlacement(GrammarParser.PlacementContext ctx) {

        ASTNode place = null;
        ASTNode iterativeStmt = null;
        ASTNode controlStmt = null;
        ASTNode rspnd = null;

        if (ctx.place() != null) {
            place = ctx.place().accept(this);
        } else if(ctx.iterativeStmt() != null) {
            iterativeStmt = ctx.iterativeStmt().accept(this);
        } else if (ctx.controlStmt() != null) {
            controlStmt = ctx.controlStmt().accept(this);
        } else if (ctx.rspnd() != null) {
            rspnd = ctx.rspnd().accept(this);
        }

        return new PlacementNode(place, iterativeStmt, controlStmt, rspnd);
    }

    @Override
    public ASTNode visitPlace(GrammarParser.PlaceContext ctx) {
        PlaceNode node = new PlaceNode();
        node.place = ctx.Place().toString();
        node.location = ctx.location().accept(this);
        //place + gate + location
        if(ctx.gate() != null) {
            node.gate = ctx.gate().accept(this);
            return node;
        }
        //place + type + location
        else if(ctx.Entrance() != null) {
            node.type = ctx.Entrance().getText();
            return node;
        }
        else if (ctx.Wall() != null) {
            node.type = ctx.Wall().getText();
            return node;
        }
        else if(ctx.ID() != null && ctx.DIGIT().isEmpty() && ctx.STRING() == null) {
            node.id = ctx.ID().get(0).getText();
            return node;
        }

        //place + id + digit + location
        else if(ctx.ID() != null && ctx.PERIOD() == null && ctx.COLON() == null && ctx.DIGIT() != null && ctx.STRING() == null){
            node.id = ctx.ID().get(0).getText();
            node.digit = Integer.parseInt(ctx.DIGIT(0).getText());
            return node;
        }
        //place + -- + digit : digit + location
        else if(ctx.ID() != null && ctx.PERIOD() == null && ctx.COLON() != null){
            node.id = ctx.ID().get(0).getText();
            node.to = parseInt(ctx.DIGIT(0).getText());
            node.from = parseInt(ctx.DIGIT(1).getText());
            return node;
        }
        //place + id + string + location
        else if(ctx.ID() != null && ctx.PERIOD() == null && ctx.STRING() != null){
            node.id = ctx.ID().get(0).getText();
            node.name = ctx.STRING().getText();
            return node;
        }

        //place + id + id + digit : digit + location
        else if(ctx.ID() != null && ctx.PERIOD() != null && ctx.COLON() != null){
            node.id = ctx.ID().get(0).getText();
            node.idAttr = ctx.ID().get(1).getText();
            node.from = Integer.parseInt(ctx.DIGIT().get(1).getText());
            node.to = Integer.parseInt(ctx.DIGIT().get(2).getText());
            return node;
        }
        //place + id + id +  string + location
        else if(ctx.ID() != null && ctx.PERIOD() != null && ctx.STRING() != null && ctx.DIGIT().isEmpty()){
            node.id = ctx.ID().get(0).getText();
            node.idAttr = ctx.ID().get(1).getText();
            node.name = ctx.STRING().getText();
            return node;

        }
        //place + id + id + digit + location
        else if(ctx.ID() != null && ctx.PERIOD() != null && ctx.COLON() == null){
            node.id = ctx.ID().get(0).getText();
            node.idAttr = ctx.ID().get(1).getText();
            node.digit = Integer.parseInt(ctx.DIGIT().get(0).getText());
            return node;
        }

        return node;
    }

    @Override
    public ASTNode visitEntityDcl(GrammarParser.EntityDclContext ctx) {
        if (ctx.Entities() != null){
            return new EntityDclNode(ctx.Entities().getText(), ctx.entities().get(0).accept(this));
        }
        return null;
    }

    @Override
    public ASTNode visitEntities(GrammarParser.EntitiesContext ctx) {
        if (ctx.enemy() != null) {
            return new EntitiesNode(ctx.ID().getText(), ctx.enemy().accept(this));
        } else if(ctx.item() != null) {
            return new EntitiesNode(ctx.ID().getText(), ctx.item().accept(this));
        }

        return null;
    }

    @Override
    public ASTNode visitEnemy(GrammarParser.EnemyContext ctx) {
        if (ctx.STRING() != null) {
            return new EnemyNode(ctx.Enemy().getText(), Integer.parseInt(ctx.DIGIT().get(0).getText()),
                    Integer.parseInt(ctx.DIGIT().get(1).getText()), ctx.STRING().getText());
        } else if (ctx.STRING() == null) {
            return new EnemyNode(ctx.Enemy().getText(), Integer.parseInt(ctx.DIGIT().get(0).getText()),
                    Integer.parseInt(ctx.DIGIT().get(1).getText()));
        }

        return null;
    }

    @Override
    public ASTNode visitItem(GrammarParser.ItemContext ctx) {
        if (ctx.STRING() != null && ctx.COLON() != null) {
            return new ItemNode(ctx.STRING().getText(), Integer.parseInt(ctx.DIGIT(2).getText()), Integer.parseInt(ctx.DIGIT(3).getText()));
        }
        else if((ctx.STRING() != null || ctx.DIGIT() != null) && ctx.COLON() == null) {
            return new ItemNode(ctx.STRING().toString(), Integer.parseInt(ctx.DIGIT(1).getText()));
        }
        return null;
    }

    @Override
    public ASTNode visitBexpr(GrammarParser.BexprContext ctx) {
        if(ctx.bexpr() != null) {
            ctx.bexpr().accept(this);
            ctx.bterm().accept(this);
            ctx.bterm().accept(this);
        } else {
            ctx.bterm().accept(this);
        }
        return null;
    }

    @Override
    public ASTNode visitBterm(GrammarParser.BtermContext ctx) {

        if (ctx.bterm() != null) {
            ctx.bterm().accept(this);
            ctx.reloprt().accept(this);
            ctx.baexpr().accept(this);
        } else if(ctx.baexpr() != null) {
            ctx.baexpr().accept(this);
        }
        return null;
    }

    @Override
    public ASTNode visitBaexpr(GrammarParser.BaexprContext ctx) {

        if (ctx.baexpr() != null) {
            ctx.baexpr().accept(this);
            ctx.asoprt().accept(this);
            ctx.baterm().accept(this);
        } else {
            ctx.baterm().accept(this);
        }
        return null;
    }

    @Override
    public ASTNode visitBaterm(GrammarParser.BatermContext ctx) {
        if (ctx.baterm() != null) {
            ctx.baterm().accept(this);
            ctx.mmdoprt().accept(this);
            ctx.bfactor().accept(this);
        } else if (ctx.bfactor() != null){
            ctx.bfactor().accept(this);

        }
        return null;
    }

    @Override
    public ASTNode visitBfactor(GrammarParser.BfactorContext ctx) {
        if(ctx.bexpr() != null) {
            ctx.bexpr().accept(this);
        }else if(ctx.condexpr() != null) {
            ctx.condexpr().accept(this);
        }
        return null;
    }

    @Override
    public ASTNode visitCondexpr(GrammarParser.CondexprContext ctx) {
        if(ctx.aexpr() != null){
            ctx.aexpr().accept(this);
        } else if(ctx.tileXY() != null) {
            ctx.tileXY().accept(this);
        } else if(ctx.coordinate() != null) {
            ctx.coordinate().accept(this);
        } else if(ctx.Tile() != null) {
            return new CondexprNode(ctx.Tile().getText());
        } else if(ctx.PlayerPosition() != null) {
            return new CondexprNode(ctx.Tile().getText());
        }


        return null;
    }

    @Override
    public ASTNode visitAexpr(GrammarParser.AexprContext ctx) {
        if (ctx.aexpr() != null && ctx.term() != null) {
            ctx.aexpr().accept(this);
            ctx.asoprt().accept(this);
            ctx.term().accept(this);
        } else if(ctx.term() != null) {
            ctx.term().accept(this);
        }
        return null;
    }

    @Override
    public ASTNode visitTerm(GrammarParser.TermContext ctx) {
        if (ctx.term() != null && ctx.factor() != null) {
            ctx.term().accept(this);
            //ctx.mmdoprt().accept(this); Skal fikses, kan ikke genkende den
            ctx.factor().accept(this);
        } else if(ctx.factor() != null) {
            ctx.factor().accept(this);
        }
        return null;
    }

    @Override
    public ASTNode visitFactor(GrammarParser.FactorContext ctx) {
        if (ctx.aexpr() != null) {
            ctx.aexpr().accept(this);
        } else if (ctx.DIGIT() != null) {
            return new FactorNode(Integer.parseInt(ctx.DIGIT().getText()));
        }
        return null;
    }

    @Override
    public ASTNode visitLogoprt(GrammarParser.LogoprtContext ctx) {
        if (ctx.AndOprt() != null){
            return new LogOprtNode(ctx.AndOprt().getText());
        }
        else if (ctx.OrOprt() != null) {
            return new LogOprtNode(ctx.OrOprt().getText());
        }
        return null;

    }

    @Override
    public ASTNode visitReloprt(GrammarParser.ReloprtContext ctx) {
        if(ctx.CompareOprt() != null) {
            return new RelOprtNode(ctx.CompareOprt().getText());
        }
        else if (ctx.GreaterOrEqual() != null) {
            return new RelOprtNode(ctx.GreaterOrEqual().getText());
        }
        else if (ctx.LessOrEqual() != null) {
            return new RelOprtNode(ctx.LessOrEqual().getText());
        }
        else if (ctx.LessThan() != null) {
            return new RelOprtNode(ctx.LessThan().getText());
        }
        else if (ctx.GreaterThan() != null) {
            return new RelOprtNode(ctx.GreaterThan().getText());
        }
        else if (ctx.NotOprt() != null) {
            return new RelOprtNode(ctx.NotOprt().getText());
        }

        return null;

    }

    @Override
    public ASTNode visitAsoprt(GrammarParser.AsoprtContext ctx) {
        if(ctx.AddOprt() != null){
            return new AddNode(ctx.AddOprt().getText());
        }
        else if (ctx.SubOprt() != null) {
            return new SubNode(ctx.SubOprt().getText());
        }
        return null;

    }

    @Override
    public ASTNode visitMmdoprt(GrammarParser.MmdoprtContext ctx) {
        if(ctx.MultiOprt() != null){
            return new MmdOprtNode(ctx.MultiOprt().getText());
        }
        else if (ctx.DivOprt() != null) {
            return new MmdOprtNode(ctx.DivOprt().getText());
        }
        else if (ctx.ModOprt() != null) {
            return new MmdOprtNode(ctx.ModOprt().getText());
        }

        return null;

    }

    @Override
    public ASTNode visitRspnd(GrammarParser.RspndContext ctx) {

        if (ctx.Print() != null) {
            return new RspndNode(ctx.Print().getText(), ctx.STRING().getText());
        }
        return null;
    }

    @Override
    public ASTNode visitLocation(GrammarParser.LocationContext ctx) {

        if (ctx.coordinate() != null){
            return ctx.coordinate().accept(this);
        }
        else if (ctx.Tile() != null){
            return new LocationNode(ctx.Tile().getText());
        }
        return null;
    }

    @Override
    public ASTNode visitGameLoop(GrammarParser.GameLoopContext ctx) {

        if (ctx.Game() != null){
            return new GameLoopNode(ctx.Game().getText(), ctx.levelName().accept(this), ctx.placement().get(0).accept(this));
        }
        return null;

    }

    @Override
    public ASTNode visitCoordinate(GrammarParser.CoordinateContext ctx) {

        return new CoordinateNode(ctx.DIGIT().get(0).getText(), ctx.DIGIT().get(1).getText());
    }

    @Override
    public ASTNode visitTileXY(GrammarParser.TileXYContext ctx) {

        if(ctx.COORDINATEX() != null && ctx.COORDINATEY() != null){
            return new TileXYNode(ctx.Tile().getText(), ctx.COORDINATEX().getText());
        } else if(ctx.COORDINATEY() != null) {
            return new TileXYNode(ctx.Tile().getText(), ctx.COORDINATEY().getText());
        }

        return null;
    }

    @Override
    public ASTNode visitLevelName(GrammarParser.LevelNameContext ctx) {

        if(ctx.Level() != null){
            return new LevelNameNode(ctx.Level().getText(), ctx.ID().getText());
        }
        return null;

    }

    @Override
    public ASTNode visitGate(GrammarParser.GateContext ctx) {
        GateNode gate = null;
        gate.gate = ctx.Gate().getText();
        if (ctx.levelName() != null) {
            gate.levelName = ctx.levelName().accept(this);
            return new GateNode(gate.gate, gate.levelName);
        } else if (ctx.Finish() != null){
            gate.finish = ctx.Finish().getText();
            return new GateNode(gate.gate, gate.finish);
        }
        return null;
    }

    @Override
    public ASTNode visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public ASTNode visitChildren(RuleNode node) {
        return null;
    }

    @Override
    public ASTNode visitTerminal(TerminalNode node) {
        return null;
    }

    @Override
    public ASTNode visitErrorNode(ErrorNode node) {
        return null;
    }
}
