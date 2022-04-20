package ASTNodes;

import ASTVisitors.ASTvisitor;

public class PlaceNode implements ASTNode {
    public String place;
    public String id;
    public String idAttr;
    public int digit;
    public int from;
    public int to;
    public String name;
    public String type;
    public ASTNode gate;
    public ASTNode location;


    //place + id + digit + location: DONE
    //place + -- + digit : digit + location: DONE
    //place + id + string + location DONE
    //place + id + id + digit + location: DONE
    //place + id + id + digit : digit + location: Done
    //place + id + id +  string + location
    //place + type + location

    public PlaceNode() {/* ... */}

    /*
    public PlaceNode (String place, String id, int digit, ASTNode location) {
        this.place = place;
        this.id = id;
        this.digit = digit;
        this.location = location;
    }


    public PlaceNode(String place, String id, int from, int to, ASTNode location) {
        this.place = place;
        this.id = id;
        this.from = from;
        this.to = to;
        this.location = location;
    }

    public PlaceNode(String place, String id, String name, ASTNode location) {
        this.place = place;
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public PlaceNode(String place, String id, String idAttr, int digit, ASTNode location) {
        this.place = place;
        this.id = id;
        this.idAttr = idAttr;
        this.digit = digit;
        this.location = location;
    }

    public PlaceNode(String place, String id, String idAttr, int from, int to, ASTNode location) {
        this.place = place;
        this.id = id;
        this.idAttr = idAttr;
        this.from = from;
        this.to = to;
        this.location = location;
    }

    public PlaceNode(String place, String id, String idAttr, String name, ASTNode location) {
        this.place = place;
        this.id = id;
        this.idAttr = idAttr;
        this.name = name;
        this.location = location;
    }

    public PlaceNode(String place, String type, ASTNode location) {
        this.place = place;
        this.type = type;
        this.location = location;
    }

    public PlaceNode(String place, ASTNode gate, ASTNode location) {
        this.place = place;
        this.gate = gate;
        this.location = location;
    }

    */

    @Override
    public void accept(ASTvisitor v) {
        v.visit(this);
    }
}
