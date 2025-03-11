public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
        System.out.println("Salary updated to: INR " + salary);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: INR " + salary);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "IT", 60000);
        emp1.displayEmployeeDetails();


        emp1.setSalary(65000);
        emp1.displayEmployeeDetails();

        Manager mgr = new Manager(201, "HR", 80000, "Recruitment Team");
        mgr.displayManagerDetails();

        mgr.setSalary(90000);
        mgr.displayManagerDetails();
    }
}


class Manager extends Employee {
    private String teamName;

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: INR " + getSalary());
        System.out.println("Team Name: " + teamName);
        System.out.println("------------------------");
    }
}


