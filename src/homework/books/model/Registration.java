package homework.books.model;

public class Registration {
    private String name;
    private String surname;
    private int age;
    private String username;
    private String passport;

    public Registration() {
    }

    public Registration(String name, String surname, int age, String username, String passport) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.username = username;
        this.passport = passport;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }
}

