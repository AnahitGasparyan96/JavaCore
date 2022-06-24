package chapters.chapter8;

public class W {
    int i, j;

    W(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class E extends W {
    int k;

    E(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override1 {
    public static void main(String[] args) {
        E subOb = new E(1, 2, 3);
        subOb.show("its k:");
        subOb.show();
    }

}