package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        //հաշվել թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;

            }

        }
        System.out.println(count);

        System.out.println();


        // գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        System.out.println(chars[chars.length/2]);
        System.out.println(chars[chars.length/2
                -1]);



        System.out.println();


        //պետք է տպել true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};

        int y = chars3.length - 1;
        int x = chars3.length - 2;

        if (chars3[y] == 'y' && chars3[x] == 'l') {

            System.out.println("մասիվը վերջանում է l, y " + true);
        } else {

            System.out.println("չի վերջանում  l, y " + false);

        }
        System.out.println();


        //տպել մասիվի այն սինվոլները որոնք պռաբել չեն
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};

        for (int i = 0; i < text.length; i++) {

            if (text[i] != ' ') {

                System.out.print(text[i] + " ");
            }


        }

        System.out.println();


        //Տպել true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean bobThere = false;
        for (int i = 0; i < bobArray.length - 2; i++) {

            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bobThere = true;

               break;
            }

        }
        System.out.println("bobThere -> " + bobThere);
    }
}



    


