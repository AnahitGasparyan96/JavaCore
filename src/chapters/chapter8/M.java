package chapters.chapter8;

public class M {
    int i, j;

    M(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class N extends M {
    int k;

    N(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        N subOb = new N(1, 2, 3);
        subOb.show();
    }
}
