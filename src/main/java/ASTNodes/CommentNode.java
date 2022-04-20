package ASTNodes;

import ASTVisitors.ASTvisitor;

public class CommentNode implements ASTNode {
    public String comment;

    public CommentNode(String comment) {
        this.comment = comment;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
