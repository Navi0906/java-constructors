
class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "Father");
        book1.displayBookDetails();

        // Modifying author using setter method
        book1.setAuthor("Mother");
        book1.displayBookDetails();

        // Creating an EBook object
        EBook ebook = new EBook("978-1-23-456789-7", "Advanced Java", "Brother", 2.5);
        ebook.displayEBookDetails();
    }
}


class EBook extends Book {
    private double fileSize;


    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display ebook details
    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN);  // Public: Accessible
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("------------------------");
    }
}
