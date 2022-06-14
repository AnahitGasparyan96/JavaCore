package homework.dynamicArray;

public class DynamicArray {
    int[] array = new int[10];
    private int size;

    public boolean isEmpty() {
        if (array.length == 0) {
            return true;
        }
        return false;
    }

    public int getByIndex(int[] array, int index) {
        if (index > size) {
            return 0;
        }
        return array[index];
    }

    public int getFirstIndexByValue(int value) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }

        }
        return index;

    }

    public void set(int index, int value) {

        for (int i = 0; i < size; i++) {
            if (index == i) {
                array[i] = value;
            }
            System.out.print(array[i] + " ");
        }


    }

    public void add(int value) {
        if (size == array.length) {
            int[] temp = new int[array.length + 10];
            for (int i = 0; i < size; i++) {
                temp[i] = array[i];


            }
            array = temp;
        }


        array[size++] = value;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }

    public void add(int index, int value) {

        for (int i = index; i < array.length; i++) {
            int temp = value;
            value = array[i];
            array[i] = temp;


        }
        size++;

    }

    public void delete(int index) {
        for (int i = index + 1; i < array.length; i++) {
            array[i - 1] = array[i];


        }
        size--;

    }


}
