package chapters.chapter8;

public class Box1 {
    double width;
    double height;
    double depth;

    Box1(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box1(double len) {
        width = height = depth = len;

    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight2 extends Box1 {
    double weight;

    BoxWeight2(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    BoxWeight2 (double w, double h, double d, double m) {
        super (w,h,d);
        weight = m;
    }
    BoxWeight2 () {
        super();
        weight = -1;
    }
    BoxWeight2 (double len, double m) {
        super (len);
        weight = m;
    }

    public BoxWeight2(BoxWeight2 myBox1) {

    }
}


