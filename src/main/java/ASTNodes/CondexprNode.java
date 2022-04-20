package ASTNodes;

import ASTVisitors.ASTvisitor;

public class CondexprNode implements ASTNode{
    public String tileState;

    public CondexprNode(String tileState) {
        this.tileState = tileState;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }

}
