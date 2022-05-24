package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};

        int spaceCount = 0;

        for (int i = 0; i < spaceArray.length; i++) {

            if (spaceArray[i] == ' ') {
                spaceCount++;
            }

        }

        char[] result = new char[spaceArray.length - spaceCount];

        int carentIndex = 0;

        for (int i = 0; i < spaceArray.length; i++) {

            if (spaceArray[i] != ' ') {
                result[carentIndex] = spaceArray[i];
                carentIndex++;
            }

        }

        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
