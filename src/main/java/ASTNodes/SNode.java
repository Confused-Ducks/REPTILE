package ASTNodes;

import ASTVisitors.ASTvisitor;
import java.util.List;

public class SNode implements ASTNode {

    public List<ASTNode> importer;
    public List<ASTNode> dcl;
    public ASTNode cmdStmt;
    public ASTNode gameLoop;

    public SNode(List<ASTNode> importer, List<ASTNode> dcl, ASTNode cmdStmt, ASTNode gameLoop) {
        this.importer = importer;
        this.dcl = dcl;
        this.cmdStmt = cmdStmt;
        this.gameLoop = gameLoop;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
