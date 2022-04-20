package ASTNodes;

import ASTVisitors.ASTvisitor;

public class RelOprtNode implements ASTNode {

    public String relOprt;

    public RelOprtNode(String relOprt) {
        this.relOprt = relOprt;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
