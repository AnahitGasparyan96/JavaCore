package chapters.chapter8;

public class AA {
    void callme() {
        System.out.println("B методе callme() из класса AА");
    }
}

class BB extends AA {
    void callme() {
        System.out.println("B методе callme() из класса ВB");
    }
}

class CC extends AA {
    void callme() {
        System.out.println("B методе callme() из класса СC");
    }
}

class Dispatch {
    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB();
        CC cc = new CC();
        AA r;
        r = aa;
        r.callme();
        r = bb;
        r.callme();
        r = cc;
        r.callme();
    }
}