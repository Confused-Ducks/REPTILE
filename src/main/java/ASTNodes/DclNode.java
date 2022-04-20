package ASTNodes;

import ASTVisitors.ASTvisitor;

public class DclNode implements ASTNode{

    public ASTNode playerDcl;
    public ASTNode levelDcl;
    public ASTNode entityDcl;
    public String comment;
    public String lineComment;

    public DclNode(ASTNode playerDcl, ASTNode levelDcl, ASTNode entityDcl) {
        this.playerDcl = playerDcl;
        this.levelDcl = levelDcl;
        this.entityDcl = entityDcl;
    }

    public DclNode(ASTNode playerDcl, ASTNode levelDcl, ASTNode entityDcl, String comment, String lineComment) {
        this.playerDcl = playerDcl;
        this.levelDcl = levelDcl;
        this.entityDcl = entityDcl;
        this.comment = comment;
        this.lineComment = lineComment;
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
