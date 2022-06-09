package chapters.chapter7;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);
        Box2 myclone = new Box2(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("mybox1 - ի ծավալը հավասար է " + vol);
        vol = mybox2.volume();
        System.out.println("mybox2 - ի ծավալը հավասար է " + vol);
        vol = mycube.volume();
        System.out.println("cube - ի ծավալը հավասար է " + vol);
        vol = myclone.volume();
        System.out.println("clone - ի ծավալը հավասար է " + vol);
    }
}
