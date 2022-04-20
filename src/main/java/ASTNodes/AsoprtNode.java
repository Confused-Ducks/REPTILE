package ASTNodes;

import ASTVisitors.ASTvisitor;

public class AsoprtNode implements ASTNode{

    public ASTNode plus;
    public ASTNode minus;

    public AsoprtNode(ASTNode plus, ASTNode minus) {
        this.plus = plus;
        this.minus = minus;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
