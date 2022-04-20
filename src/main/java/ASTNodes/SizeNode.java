package ASTNodes;

import ASTVisitors.ASTvisitor;

public class SizeNode implements ASTNode{
    public int firstDigit;
    public int secondDigit;

    public SizeNode(int firstDigit, int secondDigit) {
        this.firstDigit = firstDigit;
        this.secondDigit = secondDigit;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
