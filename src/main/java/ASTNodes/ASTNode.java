package ASTNodes;

import ASTVisitors.ASTvisitor;

import java.util.Collection;

public interface ASTNode<T> {
    void accept(ASTvisitor v);
}
