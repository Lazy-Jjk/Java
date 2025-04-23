abstract class BankAccount {
    double balance;
    String accountNumber;

    BankAccount(String accNum, double bal) {
        accountNumber = accNum;
        balance = bal;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accNum, double bal) {
        super(accNum, bal);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Savings: Deposited $" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings: Withdrew $" + amount);
        } else System.out.println("Savings: Insufficient funds");
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit = 500;

    CurrentAccount(String accNum, double bal) {
        super(accNum, bal);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Current: Deposited $" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Current: Withdrew $" + amount);
        } else System.out.println("Current: Exceeds overdraft limit");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount("SA001", 1000);
        BankAccount ca = new CurrentAccount("CA001", 1500);

        sa.deposit(200); sa.withdraw(300);
        ca.deposit(500); ca.withdraw(2200);
    }
}
