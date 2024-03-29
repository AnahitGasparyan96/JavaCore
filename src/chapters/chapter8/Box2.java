package chapters.chapter8;

public class Box2 {
    private double width;
    private double height;
    private double depth;

    Box2(Box ob) {
        width = ob.width;
        height = ob.height;
        ;
        depth = ob.depth;
    }

    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len) {
        width = height = depth = len;
    }

    public Box2(BoxWeight3 ob) {

    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight3 extends Box2 {
    double weight;

    BoxWeight3(BoxWeight3 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight3(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight3() {
        super();
        weight = -1;
    }

    BoxWeight3(double len, double m) {
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight3 {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
