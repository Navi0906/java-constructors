public class LibraryBook {
    String title;
    String author;
    double price;
    int availability;

    //Default constructor
    LibraryBook(){
        this.title = "Mathematics";
        this.author = "RD Sharma";
        this.price = 1000.00;
        this.availability = 3;
    }

    //Parametrized
    LibraryBook(String title,String author, double price, int availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    LibraryBook(LibraryBook other){
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.availability = other.availability;
    }

    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Availability :"+availability);
    }

    public static void main(String[] args) {
        LibraryBook obj1 = new LibraryBook();
        obj1.display();
        System.out.println();
        LibraryBook obj2 = new LibraryBook("Fault in out stars", "Hollywood", 1250.00, 4);
        obj2.display();
        System.out.println();
        LibraryBook obj3 = new LibraryBook(obj2);
        obj3.display();
    }
}
