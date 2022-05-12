package chapters.chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;

        System.out.println("b-ն հավասար է " + b);
        b = true;

        System.out.println("b-ն հավասար է " + b);
        if (b) {
            System.out.println("աշխատում է");
        }

        b = false;
        if (b) {
            System.out.println("չի աշխատում");
        }

        System.out.println("10 > 9-ից հավասար է " + (10 > 9));
    }
}
