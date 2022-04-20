package ASTNodes;

import ASTVisitors.ASTvisitor;

public class FactorNode implements ASTNode{
    public int digit;

    public FactorNode(int digit) {
        this.digit = digit;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
