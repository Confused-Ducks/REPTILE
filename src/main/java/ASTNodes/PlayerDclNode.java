package ASTNodes;

import ASTVisitors.ASTvisitor;

import java.util.List;

public class PlayerDclNode implements ASTNode {

    public String player;
    public List<ASTNode> attributes;

    public PlayerDclNode(String player, List<ASTNode> attributes) {
        this.player = player;
        this.attributes = attributes;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
