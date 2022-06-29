package Day3;

class BankAccount {
    private double balance;

    // Empty constructor
    BankAccount() {

    }

    // Constructor for setting balance
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 5000) {
            balance += amount;
        } else {
            System.out.printf("Transaction cancelled. Max deposit - 5000 | Your deposit: %.2f.%n", amount);
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("There are not enough funds.");
        }
    }

    // Print method
    public void printBalance() {
        System.out.printf("Current balance: %.2f%n", balance);
    }

    // Transfer method
    public void transferFrom(BankAccount bankAccount, double amount) {
        if (bankAccount.balance < amount) {
            System.out.printf("Transfer cancelled. You are trying to transfer %.2f units, but only %.2f are available.", amount, bankAccount.balance);
        } else {
            balance += amount;
            bankAccount.balance -= amount;
        }
    }

}

public class Task3and4 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(3000);
        BankAccount bankAccount2 = new BankAccount(999);

        bankAccount.withdraw(3500);
        bankAccount.printBalance();
        bankAccount.deposit(5500);
        bankAccount2.transferFrom(bankAccount2, 1000);


    }
}
