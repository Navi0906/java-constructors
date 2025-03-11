public class Vehicle {
    private String ownerName;
    private String vehicleType;

    static double registrationFee = 500.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: INR " + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to INR " + newFee);
    }


    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Dhruv", "Car");
        Vehicle vehicle2 = new Vehicle("Madhav", "Motorcycle");

        System.out.println("Initial Vehicle Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(600.0);
        System.out.println();
        System.out.println("Updated Vehicle Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}
