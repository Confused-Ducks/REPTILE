package ASTNodes;

import ASTVisitors.ASTvisitor;

public class ImportStmtNode implements ASTNode{

    public String importToken;
    public String ID;
    public String fileType;

    public ImportStmtNode(String importToken, String ID, String fileType) {
        this.importToken = importToken;
        this.ID = ID;
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return importToken + " " + '<' + ID + fileType + '>';
    }

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }

}
