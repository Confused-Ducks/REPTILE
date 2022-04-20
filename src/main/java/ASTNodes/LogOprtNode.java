package ASTNodes;

import ASTVisitors.ASTvisitor;

public class LogOprtNode implements ASTNode {

    public String logOprt;

    public LogOprtNode(String logOprt){
        this.logOprt = logOprt;
    }

    @Override
    public void accept(ASTvisitor v){
        v.visit(this);
    }

}
