package ASTNodes;

import ASTVisitors.ASTvisitor;

public class AddNode implements ASTNode{

    public String plus;

    public AddNode(String plus) {
        this.plus = plus;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
