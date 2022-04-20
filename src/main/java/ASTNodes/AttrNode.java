package ASTNodes;

import ASTVisitors.ASTvisitor;

public class AttrNode implements ASTNode {

    public int lives;

    public AttrNode(int lives) {
        this.lives = lives;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
