package ASTNodes;

import ASTVisitors.ASTvisitor;

public class RspndNode implements ASTNode{
    public String print;
    public String rspnd;

    public RspndNode(String print, String rspnd) {
        this.print = print;
        this.rspnd = rspnd;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
