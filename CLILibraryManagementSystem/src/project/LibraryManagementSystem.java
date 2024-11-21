package project;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * LibraryManagementSystem is the main class that handles the interactive user interface
 * for managing a library's book collection. It allows users to add books, search for books,
 * borrow books, and display the list of available books.
 * 
 * This program runs in a loop, prompting the user for different options until they choose
 * to exit the system.
 */
public class LibraryManagementSystem {

	 /**
     * The main entry point for the Library Management System program.
     * This method provides an interactive menu for the user to choose operations such as adding books,
     * searching books, borrowing books, displaying books, and exiting the program.
     *
     * @param args The command-line arguments (not used in this program).
     */
	public static void main(String[] args) {
		Library library = new Library(); 
		Scanner scanner = new Scanner(System.in);

		try {
			// main loop to display the menu and handle user choices
			while (true) {
				printMenu(); // display the menu
				int choice = 0;
				
				// try to read the user's menu choice
				try {
					choice = scanner.nextInt();
					scanner.nextLine(); // to clear the buffer after reading the int
				} catch (InputMismatchException e) {
					System.out.println("\nInvalid input! Please enter a valid number.\n");
					scanner.nextLine(); // clear invalid input
					continue; // skip this iteration and prompt the user again
				}

				// handle user's choice based on the menu option selected
				switch (choice) {
				case 1:
					// add a new book
					System.out.println("\nEnter title: ");
					String title = scanner.nextLine();
					System.out.println("Enter author: ");
					String author = scanner.nextLine();
					System.out.println("Enter genre: ");
					String genre = scanner.nextLine();
					
					int stock = 0;
					boolean validStock=false;
					while (!validStock) {
						System.out.println("Enter stock: ");
						try {
							stock = scanner.nextInt();
							validStock=true;
						} catch (InputMismatchException e) {
							System.out.println("\nInvalid input! Please enter a valid number.\n");
							scanner.nextLine();
						}
					}
					
					library.addBook(new Book(title, author, genre, stock));
					System.out.println("\nBook added!\n");
					break;

				case 2:
					// search a book by title
					System.out.println("\nEnter title to search: ");
					String searchTitle = scanner.nextLine();
					library.searchBook(searchTitle);
//					System.out.println(book != null ? book : "\nBook not found.\n");
					break;

				case 3:
					// borrow a book
					System.out.println("\nEnter title to borrow: ");
					String borrowTitle = scanner.nextLine();
					boolean success = library.borrowBook(borrowTitle);
					System.out.println(success ? "\nBook borrowed!\n" : "\nBook not available.\n");
					break;

				case 4:
					// display all saved books in the library
					library.displayBooks();
					break;

				case 5:
					// exit the program
					System.out.println("\nExiting...");
					try {
						Thread.sleep(1200);
					} catch (InterruptedException e) {
						System.err.println("\nError during sleep: " + e.getMessage() + "\n");
					}
					System.out.println("Exited.");
					return;

				default:
					// handle invalid menu choices
					System.out.println("\nInvalid choice. Try again, choosing one of the given options.\n");
				}
			}

		} finally {
			// ensure scanner is closed when program ends
			scanner.close();
		}
	}
	
	/**
     * Prints the main menu of the library management system.
     * The menu allows the user to select different operations such as
     * adding a book, searching for a book, borrowing a book, and exiting the program.
     */
	public static void printMenu() {
		System.out.println("****** Menu ******");
		System.out.println("1. Add Book");
		System.out.println("2. Search Book");
		System.out.println("3. Borrow Book");
		System.out.println("4. Display Books");
		System.out.println("5. Exit\n");
		System.out.print("Enter your choice: ");
	}
}
