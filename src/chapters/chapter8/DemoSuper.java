package chapters.chapter8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight2 myBox1 = new BoxWeight2(10, 20, 15, 34.3);
        BoxWeight2 myBox2 = new BoxWeight2(2, 3, 4, 0.076);
        BoxWeight2 myBox3 = new BoxWeight2();
        BoxWeight2 myCube = new BoxWeight2(3, 2);
        BoxWeight2 myclone = new BoxWeight2(myBox1);
        double vol;
        vol = myBox1.volume();
        System.out.println("Oбъeм myboxl равен " + vol);
        System.out.println("Вес myboxl равен " + myBox1.weight);
        System.out.println();
        vol = myBox2.volume();
        System.out.println(("Oбъeм mybox2 равен " + vol));
        System.out.println("Вес mybox2 равен" + myBox2.weight);
        System.out.println();
        vol = myBox3.volume();
        System.out.println("Oбъeм mybox3 равен" + vol);
        System.out.println("Вес mybox3 равен " + myBox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Oбъeм myclone равен " + vol);
        System.out.println("Вес myclone равен" + myclone.weight);
        System.out.println();
        vol = myCube.volume();
        System.out.println(("Объем mycube равен " + vol));
        System.out.println("Вес mycube равен " + myCube.weight);
        System.out.println();
    }
}
