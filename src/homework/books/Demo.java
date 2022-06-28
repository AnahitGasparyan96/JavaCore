package homework.books;

import java.util.Scanner;

public class Demo implements Commads {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        bookStorage.add(new Book("Dorian Gray", "Oscar Wilde", 3200, 5, "fiction"));
        bookStorage.add(new Book("Jane Eyre", "Charlotte Bronte", 4000, 3, "romance"));
        bookStorage.add(new Book("Idiot", "Dostoevski", 5000, 1, "Romace"));
        boolean ran = true;
        while (ran) {
            System.out.println("Please input " + EXIT + " for exit");
            System.out.println("Please input " + ADD_BOOK + " for add books");
            System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all books");
            System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by auther name");
            System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
            System.out.println("Please input " + PRINT_BY_PRICE_RANGE + " for print books by price range");
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
                default:
                    System.out.println("Indalid command");

            }
        }
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
        System.out.println(" Please input book's AuthorName");
        String bookAuthorName = scanner.nextLine();
        System.out.println("Please input book's price");
        String booksprice = scanner.nextLine();
        System.out.println("Please input book's count");
        String bookscount = scanner.nextLine();
        System.out.println("Please input book's genre");
        String booksgenre = scanner.nextLine();
        double bp = Double.parseDouble(booksprice);
        int count = Integer.parseInt(bookscount);
        Book book = new Book(bookTitle, bookAuthorName, bp, count, booksgenre);
        bookStorage.add(book);
        System.out.println("book created");
    }

}
