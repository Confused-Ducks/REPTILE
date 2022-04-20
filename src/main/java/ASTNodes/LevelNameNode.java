package ASTNodes;

import ASTVisitors.ASTvisitor;

public class LevelNameNode implements ASTNode {
    public String level;
    public String id;

    public LevelNameNode(String level, String id) {
        this.level = level;
        this.id = id;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
