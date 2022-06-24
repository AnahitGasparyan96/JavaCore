package chapters.chapter8;

public class X {
    X() {
        System.out.println("B конструкторе X.");
    }
}

class Y extends X {
    Y() {
        System.out.println("B конструкторе Y.");

    }
}

class T extends Y {
    T() {
        System.out.println("B конструкторе T.");
    }
}

class CallingCons {
    public static void main(String[] args) {
        T t = new T();
    }
}
