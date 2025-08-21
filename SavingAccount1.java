package AccountTest;

public class SavingAccount1 {
    public double balance;
    public String name;
    public double interestRate = 0.01;

    public void deposit(int x) {
        balance += x;
    }

    public void displayCostumer() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);
        
    }
}
