# CLI Library Management System 📚

This is a **command-line interface (CLI) Library Management System** built using Java. It allows users to manage a collection of books by adding, searching, borrowing, and displaying books. This project was made to practise object-oriented programming, exception handling, and working with collections like `ArrayList`.

---

## Features 🚀

- **Add Books**: Add books to the library with details like title, author, genre, and stock.
- **Search Books**: Search for a book by title, and view its details.
- **Borrow Books**: Borrow a book by reducing its stock if available.
- **Display Books**: View all books in a well-formatted table.
- **User-Friendly Menu**: Simple CLI-based menu to interact with the system.
- **Error Handling**: Input validation and exception handling for invalid inputs.

---

## Project Structure 🗂️

```plaintext
CLILibraryManagementSystem/
│
├── src/
│   └── project/
│       ├── Book.java
│       ├── Library.java
│       └── LibraryManagementSystem.java
│
└── README.md
```

### Files:

1. **`Book.java`**: Represents a book with attributes like title, author, genre, and stock.
2. **`Library.java`**: Handles the core functionality of the system, including managing the collection of books and operations like searching, borrowing, and displaying books.
3. **`LibraryManagementSystem.java`**: Main class that drives the program, presenting the menu and interacting with the user.

---

## Getting Started 🛠️

### Prerequisites
- **Java Development Kit (JDK)**: Ensure you have JDK 8 or later installed.
- **IDE or Text Editor**: Use your favourite IDE (e.g., Eclipse, IntelliJ IDEA) or a simple text editor and terminal.
- **Git**: For cloning the repository.

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/CLILibraryManagementSystem.git
   ```
2. Navigate to the project directory:
   ```bash
   cd CLILibraryManagementSystem
   ```
3. Open the project in your IDE or compile and run it from the terminal.

---

##Usage 🖥️

1. Compile the project:
   ```bash
   javac src/project.*.java
   ```
2. Run the program:
   ```bash
   java src/project/LibraryManagementSystem
   ```
3. Follow the CLI menu to interact with the system.

---

## Example Menu Interaction 📋

```plaintext
****** Menu ******
1. Add Book
2. Search Book
3. Borrow Book
4. Display Books
5. Exit

Enter your choice: 1
Enter title: Java Programming
Enter author: John Doe
Enter genre: Education
Enter stock: 5

Book added!

****** Menu ******
1. Add Book
2. Search Book
3. Borrow Book
4. Display Books
5. Exit

Enter your choice: 4

----------------------------------------------------------------------  
Title                          Author              Genre      Stock  
----------------------------------------------------------------------  
Java Programming               John Doe           Education   5  
----------------------------------------------------------------------
```

---

Thank you for checking out this project!

Feel free to contribute, suggest improvements, or share your feedback.  
Happy coding! 🎉
