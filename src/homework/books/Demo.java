package homework.books;

import homework.books.command.Commads;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.model.Registration;
import homework.books.storage.AutherStorage;
import homework.books.storage.BookStorage;
import homework.books.storage.UserStorage;

import java.util.Scanner;

public class Demo implements Commads {
    private static AutherStorage autherStorage = new AutherStorage();
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static UserStorage userStorage = new UserStorage();


    public static void main(String[] args) {
        Author dorian = new Author("bhshs", "hhhusu", "jsjap", "hhszzz");
        bookStorage.add(new Book("Dorian Gray", dorian, 3200, 5, "fiction"));
        Author bronte = new Author("hsda", "jasw", "poooi", "zxzx");
        bookStorage.add(new Book("Jane Eyre", bronte, 4000, 3, "romance"));
        Author dostoevski = new Author("uhus", "shhyyy", "hay", "bbbb");
        bookStorage.add(new Book("Idiot", dostoevski, 5000, 1, "Romace"));

        autherStorage.add(dorian);
        autherStorage.add(bronte);
        autherStorage.add(dostoevski);

        boolean ran = true;
        while (ran) {
            Commads.printRegLog();
            int command = 0;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid command");
            }
            if (command == REGISTRATION) {
                regLog();
            }
            if (command == LOGIN) {
                login();
                while (userStorage.getSize() != 0) {
                    Commads.prntCommand();
                    int innerCommand = 0;
                    try {
                        innerCommand = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid value");
                    }

                    switch (innerCommand) {

                        case EXIT:
                            ran = false;
                            break;
                        case ADD_BOOK:
                            addBook();
                            break;
                        case PRINT_ALL_BOOKS:
                            bookStorage.print();
                            break;
                        case PRINT_BOOKS_BY_AUTHOR_NAME:
                            printBookAutherName();
                            break;
                        case PRINT_BOOKS_BY_GENRE:
                            printBookByGenre();
                            break;
                        case PRINT_BY_PRICE_RANGE:
                            printBookByPriceRange();
                            break;
                        case ADD_AUTHOR:
                            addAuthor();
                            break;
                        case PRINT_ALL_AUTHORS:
                            autherStorage.print();
                            break;
                        default:
                            System.out.println("Indalid command");

                    }
                }

            }
        }
    }


    private static void login() {
        System.out.println("Please input user's login");
        String login = scanner.nextLine();
        System.out.println("Please input user's passport");
        String passport = scanner.nextLine();

        userStorage.loguser(login, passport);
    }


    private static void regLog() {
        System.out.println("Please input user's name");
        String name = scanner.nextLine();
        System.out.println("Please input user's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input user's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input user's login");
        String login = scanner.nextLine();
        System.out.println("Please input user's passport");
        String passport = scanner.nextLine();
        Registration registration = new Registration(name, surname, age, login, passport);

        userStorage.regUser(registration);
    }

    private static Author addAuthor() {
        System.out.println("Please input Author name");
        String authorName = scanner.nextLine();
        System.out.println("Please input Author surname");
        String authorSurname = scanner.nextLine();
        System.out.println("Please input Author email");
        String authoremail = scanner.nextLine();
        System.out.println("Please choose '1' for male");
        System.out.println("Please choose '2' for female");
        String c = String.valueOf(scanner.nextLine().charAt(0));
        if (Integer.parseInt(c) == 1) {
            c = "male";
        } else if (Integer.parseInt(c) == 2) {
            c = "female";

        }
        System.out.println("Auther created!");
        Author author = new Author(authorName, authorSurname, authoremail, c);
        autherStorage.add(author);
        return author;

    }

    private static void printBookByPriceRange() {
        System.out.println("Please input first price");
        double firstPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input last price");
        double lastPrice = Double.parseDouble(scanner.nextLine());
        bookStorage.printByPriceRange(firstPrice, lastPrice);
    }

    private static void printBookByGenre() {
        bookStorage.print();
        System.out.println("please input book's genre");
        String bookGenre = scanner.nextLine();
        bookStorage.printBookByGenre(bookGenre);
    }

    private static void printBookAutherName() {
        bookStorage.print();
        System.out.println("Please input book auther");
        String bookauther = scanner.nextLine();
        bookStorage.printBookByAuther(bookauther);
    }


    private static void addBook() {

        System.out.println("Please input book title");
        String bookTitle = scanner.nextLine();
        Author author = addAuthor();
        System.out.println("Please input book's price");
        String booksprice = scanner.nextLine();
        System.out.println("Please input book's count");
        String bookscount = scanner.nextLine();
        System.out.println("Please input book's genre");
        String booksgenre = scanner.nextLine();
        double bp = Double.parseDouble(booksprice);
        int count = Integer.parseInt(bookscount);
        Book book = new Book(bookTitle, author, bp, count, booksgenre);
        bookStorage.add(book);
        System.out.println("book created");
    }

}
