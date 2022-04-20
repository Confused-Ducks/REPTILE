package ASTNodes;

import ASTVisitors.ASTvisitor;


public class GameLoopNode implements ASTNode{

    public String game;
    public ASTNode levelName;
    public ASTNode placement;

    public GameLoopNode(String game, ASTNode levelName, ASTNode placement){
        this.game = game;
        this.levelName = levelName;
        this.placement = placement;
    }

    public void accept(ASTvisitor v){
        v.visit(this);
    }
}


