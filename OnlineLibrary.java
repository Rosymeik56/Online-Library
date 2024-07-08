package OnlineLibrary;

import java.util.Scanner;

class Library {
    private String[] allBooks;
    private int noOfBooks;
    private String[] userNames;

    // Constructor for Library
    Library() {
        this.allBooks = new String[100];
        this.noOfBooks = 0;
        this.userNames = new String[100];
    }

    void addBook(String book, String user) {
        this.allBooks[noOfBooks] = book;
        this.userNames[noOfBooks] = user;
        noOfBooks++;
        System.out.println("\n" + user + " has added the book: " + book);
    }

    void showAvailableBooks() {
        System.out.println("\nAvailable Books are:");
        for (int i = 0; i < noOfBooks; i++) {
            if (allBooks[i] != null) {
                System.out.println("* " + allBooks[i] + " (added by " + userNames[i] + ")");
            }
        }
    }
}


public class OnlineLibrary {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter your name: ");
            String userName = scanner.nextLine();
            System.out.println("Enter the book you want to add: ");
            String bookName = scanner.nextLine();

            centralLibrary.addBook(bookName, userName);

            System.out.println("\nDo you want to add another book? (yes/no): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        centralLibrary.showAvailableBooks();
        }
    }

