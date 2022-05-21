package chapters.chapter5;

public class MissingBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i - ն փոքր է 5-ից");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i - ն փոքր է 10-ից");
                    break;
                default:
                    System.out.println("i - ն հավասար կամ մեծ է 10-ից ");
            }

        }
    }
}
