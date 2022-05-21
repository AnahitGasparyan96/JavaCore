package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {28, 25, 62, 22, 55, 82, 5, 96, 77, 8};
        //տպել մասիվի բոլոր էլեմենտները//

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }

        System.out.println();


        //մասիվի ամենամեծ թիվը//
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("Ամենամեծ թիվը հավասար է " + max);

        System.out.println();

        //մասիվի ամենափոքր թիվը//
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }

        }
        System.out.println("Ամենափոքր թիվը հավասար է " + min);

        System.out.println();


        //Տպել մասիվի բոլոր զույգ էլեմենտները//

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                System.out.print(array[i] + " ");
            }
        }

        System.out.println();


        //Տպել մասիվի բոլոր կենտ էլեմենտները//
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }

        }

        System.out.println();

        //Տպել զույգերի քանակը։//

        int pairq = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                pairq++;
            }
        }
        System.out.print("զույգ թվերի քանակը հավասար է " + pairq + "-ի");

        System.out.println();


        //Տպել կենտերի քանակը։//

        int oddq = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                oddq++;

            }

        }
        System.out.println("կենտ թվերի քանակը հավասար է " + oddq + "-ի");

        System.out.println();


        //Տպել մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)//

        double result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];

        }
        System.out.println("միջին թվաբանականը հավասար է  " + result / array.length + " ի");


        //Տպել մասիվի էլեմենտների գումարը//

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];

        }

        System.out.println("մասիվի էլեմենտների գումարը հավասար է " + total);
    }
}




























