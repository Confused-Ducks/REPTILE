package ASTNodes;

import ASTVisitors.ASTvisitor;

public class SizeNode implements ASTNode{
    public int left;
    public int right;

    public SizeNode(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
