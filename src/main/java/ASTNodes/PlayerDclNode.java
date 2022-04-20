package ASTNodes;

import ASTVisitors.ASTvisitor;

public class PlayerDclNode implements ASTNode {

    public String player;
    public ASTNode attributes;

    public PlayerDclNode(String player, ASTNode attributes) {
        this.player = player;
        this.attributes = attributes;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
