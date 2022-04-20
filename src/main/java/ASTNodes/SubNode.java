package ASTNodes;

import ASTVisitors.ASTvisitor;

public class SubNode implements ASTNode {

    public String minus;

    public SubNode( String minus) {
        this.minus = minus;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
