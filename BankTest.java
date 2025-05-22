abstract class BankAccount {
    String accountnumber;
    String holdername;
    double balance;

    BankAccount(String accountnumber, String holdername, double balance) {
        this.accountnumber = accountnumber;
        this.holdername = holdername;
        this.balance = balance;
    }

    abstract double calculateintrest();

    void deposit(double amount) {
        balance += amount;
        System.out.println("deposit:" + amount + "Balance:" + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount; // Corrected: balance should be reduced by amount
            System.out.println("withdraw:" + amount + "new balance;" + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingAccount extends BankAccount {
    SavingAccount(String accountnumber, String holdername, double balance) {
        super(accountnumber, holdername, balance);
    }

    double calculateintrest() {
        return balance * 0.02;
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(String accountnumber, String holdername, double balance) { // Corrected: typo in holdername
        super(accountnumber, holdername, balance);
    }

    double calculateintrest() {
        return balance * 0.04;
    }
}

public class BankTest {
    public static void main(String args[]) {
        BankAccount Saving = new SavingAccount("sbi03", "john", 40000);
        BankAccount current = new CurrentAccount("sbi104", "bob", 15000);

        System.out.println("Saving Account Intrest: " + Saving.calculateintrest());
        Saving.withdraw(3000);
        System.out.println("Current Account Intrest: " + current.calculateintrest());
        current.deposit(7000);
        current.withdraw(5000);
    }
}
