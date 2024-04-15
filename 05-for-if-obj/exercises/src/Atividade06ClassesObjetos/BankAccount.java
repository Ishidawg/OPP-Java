package Atividade06ClassesObjetos;

public class BankAccount {
    private int accountNumber;
    private double balance;

    // Setter
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter
    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double checkBalance() {
        return this.balance;
    }
}
