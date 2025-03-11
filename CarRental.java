import java.sql.SQLOutput;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    void calculate(){
        System.out.println("The total cost is "+(150*rentalDays));
    }

    void display(){
        System.out.println(customerName+" took "+carModel+" for "+rentalDays+" days.");
    }

    public static void main(String[] args) {
        CarRental obj1 = new CarRental("Navi", "BMW M5 Competition", 31);
        obj1.display();
        obj1.calculate();
    }
}
