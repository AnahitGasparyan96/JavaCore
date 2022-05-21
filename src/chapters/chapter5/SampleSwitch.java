package chapters.chapter5;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i - ն հավասար է զրոյի");
                    break;
                case 1:
                    System.out.println("i - ն հավասար է մեկի");
                    break;
                case 2:
                    System.out.println("i - ն հավասար է երկուսի");
                    break;
                case 3:
                    System.out.println("i - ն հավասար է երեքի");
                    break;
                default:
                    System.out.println("i - ն մեծ է երեքից");
            }
        }
    }
}
