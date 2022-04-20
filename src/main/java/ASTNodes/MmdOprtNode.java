package ASTNodes;

import ASTVisitors.ASTvisitor;

public class MmdOprtNode implements ASTNode{

    public String mmdOprt;

    public MmdOprtNode(String mmdOprt) {
        this.mmdOprt = mmdOprt;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
