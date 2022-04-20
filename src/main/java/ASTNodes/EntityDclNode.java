package ASTNodes;

import ASTVisitors.ASTvisitor;

import java.util.List;

public class EntityDclNode implements ASTNode{
    public String entity;
    public List<ASTNode> entities;

    public EntityDclNode(String entity, List<ASTNode> entities) {
        this.entity = entity;
        this.entities = entities;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }

}
