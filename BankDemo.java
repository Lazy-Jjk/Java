abstract class BankAccount {
    protected double balance;
    protected String accountNumber;
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }
    
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to savings account");
    }
    
    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from savings account");
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    
    public CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to current account");
    }
    
    @Override
    void withdraw(double amount) {
        if (amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from current account");
        } else {
            System.out.println("Exceeds overdraft limit");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA001", 1000, 0.05);
        CurrentAccount current = new CurrentAccount("CA001", 2000, 500);
        
        System.out.println("Savings Account:");
        savings.deposit(500);
        savings.withdraw(200);
        savings.displayBalance();
        
        System.out.println("\nCurrent Account:");
        current.deposit(1000);
        current.withdraw(3000);
        current.displayBalance();
    }
} 