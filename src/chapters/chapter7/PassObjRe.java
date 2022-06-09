package chapters.chapter7;

public class PassObjRe {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);
        System.out.println("ob.a & оb.b մինչ կանչը: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a & ob.b կանչից հետո " + ob.a + " " + ob.b);
    }
}
