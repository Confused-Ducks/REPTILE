package ASTNodes;

import ASTVisitors.ASTvisitor;

import java.util.List;

public class LevelDclNode implements ASTNode{
    public String levelDesign;
    public List<ASTNode> level;

    public LevelDclNode(String levelDesign, List<ASTNode> level) {
        this.levelDesign = levelDesign;
        this.level = level;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
