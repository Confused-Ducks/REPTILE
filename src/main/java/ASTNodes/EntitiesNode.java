package ASTNodes;

import ASTVisitors.ASTvisitor;

public class EntitiesNode implements ASTNode {
    public String id;
    public ASTNode type;

    public EntitiesNode (String id, ASTNode type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
