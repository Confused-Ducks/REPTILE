package ASTNodes;

import ASTVisitors.ASTvisitor;
import java.util.ArrayList;

public class CmdStmtNode implements ASTNode{
    public String command;
    public ArrayList<String> actions;

    public CmdStmtNode(String command, ArrayList<String> actions) {
        this.command = command;
        this.actions = actions;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
