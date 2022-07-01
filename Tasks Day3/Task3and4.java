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
    public double deposit(double amount) {
        if (amount <= 5000) {
            return balance += amount;
        } else {
            System.out.printf("Transaction cancelled. Max deposit - 5000 | Your deposit: %.2f.%n", amount);
            return 0;
        }
    }

    // Withdraw method
    public double withdraw(double amount) {
        if (amount <= balance) {
            return balance -= amount;
        } else {
            System.out.println("There are not enough funds.");
            return 0;
        }
    }

    // Print method
    public void printBalance() {
        System.out.printf("Current balance: %.2f%n", balance);
    }

    // Transfer method
    public double transferFrom(BankAccount bankAccount, double amount) {
        if (bankAccount.balance < amount) {
            System.out.printf("Transfer cancelled. You are trying to transfer %.2f units, but only %.2f are available.", amount, bankAccount.balance);
            return 0;
        } else {
            balance += amount;
            return bankAccount.balance -= amount;
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
