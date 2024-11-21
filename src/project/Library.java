package project;

import java.util.ArrayList;

/**
 * The Library class represents a collection of books in the library system.
 * It provides methods to add books, search for a book, borrow a book, and display all books in the library.
 */
public class Library {
	// list of books in the library
	private ArrayList<Book> books = new ArrayList<>();
	
	 /**
     * Adds a new book to the library's collection.
     * 
     * @param book The Book object to be added to the library.
     */
	public void addBook(Book book) {
		books.add(book);
	}
	
	/**
     * Searches for a book in the library by its title.
     * If a match is found, the book's details are displayed and the book is returned.
     * 
     * @param title The title of the book to search for.
     * @return The Book object if found, or null if no match is found.
     */
	public Book searchBook(String title) {
		// loop through all the books in the library to find a match by title
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				System.out.println("\n****** Search Result ******");
	            System.out.println("Title: " + book.getTitle());
	            System.out.println("Author: " + book.getAuthor());
	            System.out.println("Genre: " + book.getGenre());
	            System.out.println("Stock: " + book.getStock());
	            System.out.println("----------------------------\n");
	            return book;
			}
		}
		// if no match found, print a message and return null
		System.out.println("\nNo book found with the title: " + title + "\n");
		return null;
	}
	
	/**
     * Borrows a book from the library.
     * Decreases the book's stock if available.
     * 
     * @param title The title of the book to borrow.
     * @return True if the book was successfully borrowed, false if the book is unavailable.
     */
	public boolean borrowBook(String title) {
		Book book = searchBook(title);
		if (book != null && book.getStock() > 0) {
			book.setStock(book.getStock() - 1);
			return true;
		}
		return false;
	}
	
	/**
     * Displays all the books currently in the library.
     * If there are no books, a message indicating so will be printed.
     */
	public void displayBooks() {
		if (books.isEmpty()) { // check if library has no books
			System.out.println("\nNo books available in the library.\n");
			return;
		}
		// prints the table header for book details
		System.out.println();
		System.out.println("----------------------------------------------------------------------");
	    System.out.printf("%-30s %-20s %-10s %-5s\n", "Title", "Author", "Genre", "Stock");
	    System.out.println("----------------------------------------------------------------------");
		
	    // loop through the list of books and print each book's details
	    for (Book book : books) {
	        System.out.printf("%-30s %-20s %-10s %-5d\n", 
	            book.getTitle(), book.getAuthor(), book.getGenre(), book.getStock());
	    }

	    System.out.println("----------------------------------------------------------------------");
	    System.out.println();
	}
}
