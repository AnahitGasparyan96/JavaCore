package homework.figure;

public class FigureExample2 {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("  ");

            }
            for (int k = 5; k >= i; k--) {
                System.out.print("* ");

            }
            System.out.println();
        }


    }

}



