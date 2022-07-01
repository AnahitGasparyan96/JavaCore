package homework.books;

import homework.students.model.Lesson;

public class AutherStorage {
    private Author[] array = new Author[10];
    private int size;

    public void add(Author author) {
        if (size == array.length) {
            increaseArray();

        }
        array[size++] = author;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);

        }
    }

    private void increaseArray() {
        Author[] temp = new Author[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];


        }
        array = temp;
    }


    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
        } else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];

            }
            size--;
        }
    }


    public int getSize() {
        return size;
    }


    public Author getAuthorByIndex(int index1) {
        if (index1 < 0 || index1 >= size) {
            return null;
        }
        return array[index1];
    }
}
