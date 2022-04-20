package ASTNodes;

import ASTVisitors.ASTvisitor;

public class ItemNode implements ASTNode{

    public String name;
    public int from;
    public int to;
    public int dmg;

    public ItemNode (String name, int dmg){
        this.name = name;
        this.dmg = dmg;
    }

    public ItemNode (String name, int from, int to){
        this.name = name;
        this.from = from;
        this.to = to;
    }

    @Override
    public void accept (ASTvisitor v){
        v.visit(this);
    }
}
