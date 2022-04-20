package ASTNodes;

import ASTVisitors.ASTvisitor;


public class TileXYNode implements ASTNode {

    public String tile;
    public String xyCoordinate;
    //public String yCoordinate;

    public TileXYNode(String tile, String xyCoordinate) {
        this.tile = tile;
        this.xyCoordinate = xyCoordinate;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
