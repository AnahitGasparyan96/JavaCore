package chapters.chapter8;

abstract class F {
    abstract void callme();

    void callmetoo() {
        System.out.println("Этo конкретный метод.");
    }
}

class G extends F {
    void callme() {
        System.out.println("Реализация метода callme() в классе F.");
    }
}