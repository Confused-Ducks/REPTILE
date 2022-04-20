package ASTNodes;

import ASTVisitors.ASTvisitor;

public class PlacementNode implements ASTNode {

    public ASTNode place;
    public ASTNode iterativeStmt;
    public ASTNode controlStmt;
    public ASTNode rspnd;

    public PlacementNode(ASTNode place, ASTNode iterativeStmt, ASTNode controlStmt, ASTNode rspnd){
        this.place = place;
        this.iterativeStmt = iterativeStmt;
        this.controlStmt = controlStmt;
        this.rspnd = rspnd;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
