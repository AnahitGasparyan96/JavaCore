package homework.figure;

public class FigurePainter2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int k = i; k < 5; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");

            }
            System.out.println();
        }

    }
}


