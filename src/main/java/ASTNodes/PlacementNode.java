package ASTNodes;

import ASTVisitors.ASTvisitor;

public class PlacementNode implements ASTNode {

    public ASTNode place;
    public ASTNode iterativeStmtNode;
    public ASTNode controlStmt;
    public ASTNode respond;

    public PlacementNode() { /* ... */ }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
