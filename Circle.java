public class Circle {
    double radius;

    //Default Constructor
    Circle(){
        this.radius = 12.50;
    }

    //User-provided Constructor
    Circle(double radius){
        this.radius = radius;
    }

    //Displaying result
    void display(){
        System.out.println("Radius: "+radius);
    }

    public static void main(String[] args) {
        Circle obj1 = new Circle();
        obj1.display();
        System.out.println();
        Circle obj2 = new Circle(34.25);
        obj2.display();
    }
}
