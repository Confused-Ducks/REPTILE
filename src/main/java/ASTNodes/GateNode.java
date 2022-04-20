package ASTNodes;

import ASTVisitors.ASTvisitor;

public class GateNode implements ASTNode{
    public String gate;
    public ASTNode levelName;
    public String finish;

    public GateNode(String gate, ASTNode levelName) {
        this.gate = gate;
        this.levelName = levelName;
    }

    public GateNode(String gate, String finish) {
        this.gate = gate;
        this.finish = finish;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
