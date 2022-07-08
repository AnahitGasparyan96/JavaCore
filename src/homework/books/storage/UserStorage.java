package homework.books.storage;

import homework.books.model.Registration;

public class UserStorage {
    private Registration registration[] = new Registration[10];
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void regUser(Registration value) {
        if (size == registration.length) {
            Registration temp[] = new Registration[registration.length + 10];
            for (int i = 0; i < size; i++) {
                temp[i] = registration[i];
            }
            registration = temp;
        }
        registration[size++] = value;

    }

    public void loguser(String login, String passport) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (registration[i].getUsername().equals(login) && registration[i].getPassport().equals(passport)) {
                System.out.println("User created");
                System.out.println("Welcome " + registration[i].getName());
                count++;
            }

        }
        if (count == 0) {
            System.out.println("Invalid username or passport");
        }
    }
}
