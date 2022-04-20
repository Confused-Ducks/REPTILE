package ASTNodes;

import ASTVisitors.ASTvisitor;

public class EnemyNode implements ASTNode {
    public String enemy;
    public int health;
    public int damage;
    public String name;

    public EnemyNode(String enemy, int health, int damage) {
        this.enemy = enemy;
        this.health = health;
        this.damage = damage;
    }

    public EnemyNode(String enemy, int health, int damage, String name) {
        this.enemy = enemy;
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
