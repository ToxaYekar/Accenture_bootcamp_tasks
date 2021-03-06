package Day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

    BankAccount bankAccount = new BankAccount(3000);
    BankAccount bankAccount2 = new BankAccount(999);

    @Test
    void ShouldNotDeposit5500() {
        assertEquals(0, bankAccount.deposit(5500));
    }

    @Test
    void ShouldDeposit1500() {
        assertEquals(4500, bankAccount.deposit(1500));

    }

    @Test
    void ShouldNotWithdraw3500() {
        assertEquals(0, bankAccount.withdraw(3500));
    }

    @Test
    void ShouldWithdraw2000() {
        assertEquals(1000, bankAccount.withdraw(2000));
    }

    @Test
    void ShouldNotTransferMoney() {
        assertEquals(0, bankAccount2.transferFrom(bankAccount2, 1000));
    }

    @Test
    void ShouldTransferMoney() {
        assertEquals(499, bankAccount.transferFrom(bankAccount2, 500));
    }
}
