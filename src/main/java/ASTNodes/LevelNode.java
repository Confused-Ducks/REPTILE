package ASTNodes;

import ASTVisitors.ASTvisitor;

import java.util.List;

public class LevelNode implements ASTNode{

    public String levelName;
    public ASTNode size;
    public List<ASTNode> placement;

    public LevelNode(String levelName, ASTNode size, List<ASTNode> placement) {
        this.levelName = levelName;
        this.size = size;
        this.placement = placement;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
