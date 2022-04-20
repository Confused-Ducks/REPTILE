package ASTVisitors;

import ASTNodes.*;

public interface ASTvisitor<T> {
    T visit(SNode n);
    T visit(PlayerDclNode n);
    T visit(AttrNode n);
    T visit(AddNode n);
    T visit(AsoprtNode n);
    T visit(ImportStmtNode n);
    T visit(CommentNode n);
    T visit(CmdStmtNode n);
    T visit(LogOprtNode n);
    T visit(IterativeStmtNode n);
    T visit(EntityDclNode n);
    T visit(PlaceNode n);
    T visit(EntitiesNode n);
    T visit(EnemyNode n);
    T visit(LevelDclNode n);
    T visit(ItemNode n);
    T visit(CoordinateNode n);
    T visit(DclNode n);
    T visit(LocationNode n);
    T visit(SizeNode n);
    T visit(SubNode n);
    T visit(RelOprtNode n);
    T visit(CondexprNode n);
    T visit(FactorNode n);
    T visit(MmdOprtNode n);
    T visit(RspndNode n);
    T visit(GameLoopNode n);
    T visit(LevelNameNode n);
    T visit(TileXYNode n);
    T visit(GateNode n);
    T visit(LevelNode n);
    T visit(PlacementNode n);
}
