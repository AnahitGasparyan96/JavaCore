package homework.books;

import java.util.Scanner;

public class Demo implements Commads {
    private static AutherStorage autherStorage = new AutherStorage();
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

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
            Commads.prntCommand();
            int commads = Integer.parseInt(scanner.nextLine());
            switch (commads) {
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
            c= "male";
        } else if (Integer.parseInt(c) == 2) {
            c = "female";

        }
        System.out.println("Auther created!");
        Author author = new Author(authorName, authorSurname, authoremail,c);
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
