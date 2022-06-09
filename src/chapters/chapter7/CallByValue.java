package chapters.chapter7;

public class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15, b = 20;
        System.out.println("a & b մինչ կանչը " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a & b կանչից հետո " + a + " " + b);
    }
}
