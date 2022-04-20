package ASTNodes;

import ASTVisitors.ASTvisitor;
import org.antlr.v4.runtime.tree.ParseTree;

public class CoordinateNode implements ASTNode {
    public String xCoordinate;
    public String yCoordinate;

    public CoordinateNode(String xCoordinate, String yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
