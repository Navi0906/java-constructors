class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // method to get balance
    public double getBalance() {
        return balance;
    }

    // method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: INR " + amount);
    }

    // method to withdraw money
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: INR " + amount);

    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: INR " + balance);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456789", "Dhruv", 5000.0);
        acc1.displayAccountDetails();

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.displayAccountDetails();

        SavingsAccount savingsAcc = new SavingsAccount("987654321", "Madhav", 8000.0, 5.0);
        savingsAcc.displaySavingsDetails();

        savingsAcc.applyInterest();
        savingsAcc.displaySavingsDetails();
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to apply interest
    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest Applied: INR " + interest);
    }

    // Method to display savings account details
    public void displaySavingsDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: INR " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("------------------------");
    }
}



