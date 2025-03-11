public class Book {
    String title;
    String author;
    double price;

    //Default constructor
    Book(){
        this.title = "Mathematics";
        this.author = "RD Sharma";
        this.price = 1000.00;
    }

    //Parametrized
    Book(String title,String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+title);
        System.out.println("Price: "+title);
    }

    public static void main(String[] args) {
        Book obj1 = new Book();
        obj1.display();
        System.out.println();
        Book obj2 = new Book("Fault in out stars", "Hollywood", 1250.00);
        obj2.display();
    }
}
