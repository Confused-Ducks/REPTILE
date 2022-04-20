package ASTVisitors;

import ASTNodes.*;

public class Prettyprinter implements ASTvisitor<Void>{

    private int             indent = 0;
    private final String    TAB = "\t";


    @Override
    public Void visit(SNode n) {
        for (int i = 0; i < n.importer.size(); i++) {
            System.out.println(n.importer.get(i));
        }
        indent++;
        System.out.print("begin\n");
        indent++;
        //n.dcl.accept(this);
        if (n.cmdStmt != null) {
            n.cmdStmt.accept(this);
        }
        n.gameLoop.accept(this);
        indent--;
        System.out.println("end");
        indent--;

        return null;
    }

    @Override
    public Void visit(PlayerDclNode n) {

        System.out.println(TAB.repeat(indent) + n.player + " {");

        indent++;

        //n.attributes.accept(this);
        System.out.println("}");

        indent--;

        return null;
    }

    @Override
    public Void visit(AttrNode n) {

        System.out.println(TAB.repeat(indent) + "Lives : " + n.lives);

        return null;
    }

    @Override
    public Void visit(AddNode n) {

        System.out.println(TAB.repeat(indent) + n.plus);

        return null;
    }

    @Override
    public Void visit(AsoprtNode n) {

        n.plus.accept(this);
        n.minus.accept(this);


        return null;
    }

    @Override
    public Void visit(ImportStmtNode n) {

        System.out.println(TAB.repeat(indent) + n);

        return null;
    }

    @Override
    public Void visit(CommentNode n) {

        System.out.println(TAB.repeat(indent) + "/*");
        indent++;

        System.out.println(TAB.repeat(indent) + n.comment);
        indent--;

        System.out.println("*/");

        return null;
    }

    @Override
    public Void visit(CmdStmtNode n) {

        System.out.println(TAB.repeat(indent) + "Command");
        indent++;

        System.out.println(TAB.repeat(indent) + n.actions);
        indent--;

        return null;
    }

    @Override
    public Void visit(LogOprtNode n) {
        System.out.println(TAB.repeat(indent) + n.logOprt);

        return null;
    }

    @Override
    public Void visit(IterativeStmtNode n) {

        System.out.println(TAB.repeat(indent) + "for");
        indent++;


        return null;
    }

    @Override
    public Void visit(EntityDclNode n) {


        System.out.println(TAB.repeat(indent) + n.entity);
        indent++;
        for (int i = 0; i < n.entities.size(); i++){
            n.entities.get(i).accept(this);
        }
        indent--;

        return null;
    }

    @Override
    public Void visit(PlaceNode n) { // vi skal have fikset place i visitor først

        // Place LPAREN ID (PERIOD ID)? LPAREN (DIGIT | DIGIT COLON DIGIT | Quotes (ID | DIGIT)* Quotes) RPAREN RPAREN location

        // System.out.println(TAB.repeat(indent) + "place (" + n.id + ") ");



        return null;
    }





    @Override
    public Void visit(EntitiesNode n) {

        System.out.print(TAB.repeat(indent) + n.id + " = ");
        n.type.accept(this);

        return null;
    }

    @Override
    public Void visit(EnemyNode n){

        System.out.print("Enemy (");

        System.out.print("Name: " + n.name + ", ");
        System.out.print("Damage: " + n.damage + ", ");
        System.out.print("Health: " + n.health + ")");

        return null;
    }

    @Override
    public Void visit(LevelDclNode n) {

        // LevelDesign LBRACE levels+ RBRACE

        System.out.println(TAB.repeat(indent) + "LevelDesign");

        System.out.println(TAB.repeat(indent) + "{");
        indent++;

        System.out.println(TAB.repeat(indent) + n.level);
        System.out.println(TAB.repeat(indent) + n.levelDesign);

        System.out.println(TAB.repeat(indent) + "}");
        indent--;

        return null;
    }

    @Override
    public Void visit(ItemNode n) {

        System.out.print("Item (");
        System.out.print("Name: " + n.name + ", ");
        System.out.print("Damage: " + n.dmg + ") ");
        // Mangler måske lidt logik her?
        System.out.print("To: " + n.to + ", ");
        System.out.print("From: " + n.from + ")");

       /* System.out.println(TAB.repeat(indent) + "Item");
        indent++;

        System.out.println(TAB.repeat(indent) +  n.item);
        indent--;*/

        return null;
    }

    @Override
    public Void visit(CoordinateNode n) {

        System.out.println(TAB.repeat(indent) + "(" + n.xCoordinate + ", " + n.yCoordinate + ")");
        return null;
    }

    @Override
    public Void visit(DclNode n) { // DclNode skal opdateres til at passe med det nedenunder
        /*n.playerDcl.accept(this);
        n.entityDcl.accept(this);
        n.levelDcl.accept(this);

        if (n.comment != null) { */
        //  System.out.print(TAB.repeat(indent) + "/*" + n.comment + "*/");
        // }
        // if (n.lineComment != null) {
        //    System.out.print(TAB.repeat(indent) + "//" + n.lineComment);
        // }

        return null;
    }

    @Override
    public Void visit(LocationNode n) {  //locationNode skal fikses
        System.out.print(TAB.repeat(indent) + "on ");
        //n.Tile;
        return null;
    }

    @Override
    public Void visit(SizeNode n) {
        System.out.print(TAB.repeat(indent)+ "(");
        System.out.print(n.firstDigit + ", ");
        System.out.print(n.secondDigit + ")");


        return null;
    }

    @Override
    public Void visit(SubNode n) {
        System.out.println(n.minus);
        return null;
    }

    @Override
    public Void visit(RelOprtNode n) {
        System.out.print(n.relOprt);
        return null;
    }

    @Override
    public Void visit(CondexprNode n) { // CondExprNode skal fikses

        return null;
    }

    @Override
    public Void visit(FactorNode n) { //FactorNode skal fikses
        //if ()
        return null;
    }

    @Override
    public Void visit(MmdOprtNode n) {
        System.out.print(n.mmdOprt);
        return null;
    }

    @Override
    public Void visit(RspndNode n) {
        System.out.println(TAB.repeat(indent) + "print: ");
        System.out.println(n.rspnd);
        return null;
    }

    @Override
    public Void visit(GameLoopNode n) {
        System.out.println(TAB.repeat(indent) + n.game);
        n.levelName.accept(this);
        indent++;
        n.placement.accept(this);
        indent--;
        return null;
    }

    @Override
    public Void visit(LevelNameNode n) {
        System.out.print(TAB.repeat(indent) + "(" + n.level);
        System.out.print(n.id + ")");
        return null;
    }

    @Override
    public Void visit(TileXYNode n) {
        System.out.print(n.tile + "." + n.xyCoordinate);

        return null;
    }

    @Override
    public Void visit(GateNode n) {
        System.out.print(TAB.repeat(indent) + n.gate + "(");
        if (n.levelName != null) {
            System.out.print(n.levelName + ")");
        } else {
            System.out.println(n.finish + ")");
        }

        return null;
    }

    @Override
    public Void visit(PlacementNode n) {
        return null;
    }

    @Override
    public Void visit(LevelNode n) {
        return null;
    }


}