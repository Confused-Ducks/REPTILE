package ASTNodes;

import ASTVisitors.ASTvisitor;

public class EntityDclNode implements ASTNode{
    public String entity;
    public ASTNode entities;

    public EntityDclNode(String entity, ASTNode entities) {
        this.entity = entity;
        this.entities = entities;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }

}
