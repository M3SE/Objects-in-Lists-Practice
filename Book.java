import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    // Constructor
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // Method to print book details
    public void printDetails() {
        System.out.println("Title: " + title + ", Pages: " + numberOfPages + ", Year: " + publicationYear);
    }

    // Method to print book title
    public void printTitle() {
        System.out.println("Title: " + title);
    }
}

class BookCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Enter book title (or press Enter to stop): ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Enter number of pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                book.printDetails();
            }
        } else if (choice.equalsIgnoreCase("name")) {
            for (Book book : books) {
                book.printTitle();
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
}