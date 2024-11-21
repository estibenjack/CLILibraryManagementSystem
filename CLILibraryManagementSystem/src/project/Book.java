package project;

/**
 * The Book class represents a book in the library system. It contains details
 * about the book such as its title, author, genre, and stock count. This class
 * provides methods to access and modify these details.
 */
public class Book {
	private String title;
	private String author;
	private String genre;
	private int stock;
	
	  /**
     * Constructs a new Book object with the specified title, author, genre, and stock.
     * 
     * @param title The title of the book.
     * @param author The author of the book.
     * @param genre The genre of the book.
     * @param stock The stock (availability) of the book.
     */
	public Book(String title, String author, String genre, int stock) {
		this.title = title;
		this.author = author;
		this.genre=genre;
		this.stock = stock;
	}

	/**
     * Returns a string representation of the Book object, including all its attributes.
     * This is useful for displaying the book's information in a human-readable format.
     * 
     * @return A string representation of the book.
     */
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", genre=" + genre + ", stock=" + stock + "]";
	}

	/**
     * Gets the title of the book.
     * 
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     * 
     * @param title The new title for the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the author of the book.
     * 
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     * 
     * @param author The new author for the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the genre of the book.
     * 
     * @return The genre of the book.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre of the book.
     * 
     * @param genre The new genre for the book.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Gets the current stock (availability) of the book.
     * 
     * @return The stock of the book.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Sets the stock (availability) of the book.
     * 
     * @param stock The new stock value for the book.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}