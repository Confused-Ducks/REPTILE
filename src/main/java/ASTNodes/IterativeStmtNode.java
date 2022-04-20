package ASTNodes;

import ASTVisitors.ASTvisitor;

import java.util.ArrayList;

public class IterativeStmtNode implements ASTNode {

    public ArrayList<ASTNode> controlStmt;
    public String tile;
    public String tiles;
    public String forLoop;

    public IterativeStmtNode(String forLoop, String tile, String tiles, ArrayList<ASTNode> controlStmt) {
        this.forLoop = forLoop;
        this.tile = tile;
        this.tiles = tiles;
        this.controlStmt = controlStmt;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
