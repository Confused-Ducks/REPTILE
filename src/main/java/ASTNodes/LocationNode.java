package ASTNodes;

import ASTVisitors.ASTvisitor;

public class LocationNode implements ASTNode{

    public String Tile;

    public LocationNode(String Tile) {
        this.Tile = Tile;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
