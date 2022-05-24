package homework.figure;

public class FigurePainter4 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j >= i; j--) {
                System.out.print(" ");

            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();


        }
        for (int n = 0; n < 3; n++) {
            for (int m = 0; m <= n; m++) {
                System.out.print(" ");
            }
            for (int b = 2; b >= n; b--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
