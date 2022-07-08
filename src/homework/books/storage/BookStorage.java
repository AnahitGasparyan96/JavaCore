package homework.books.storage;

import homework.books.model.Book;

public class BookStorage {
    private Book[] array = new Book[10];
    private int size;

    public void add(Book value) {
        if (size == array.length) {
            increaseArray();

        }
        array[size++] = value;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");

        }
    }

    private void increaseArray() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];


        }
        array = temp;
    }

    public void printBookByAuther(String bookauther) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthorName().equals(bookauther)) {
                System.out.println(array[i]);
            }

        }
    }

    public void printBookByGenre(String bookGenre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(bookGenre)) {
                System.out.println(array[i]);
            }

        }
    }

    public void printByPriceRange(double firstPrice, double lastPrice) {
        for (int i = 0; i < size; i++) {
            if (array[i].getPrice() < lastPrice && array[i].getPrice() > firstPrice) {
                System.out.println(array[i]);
            }
        }
    }
}
