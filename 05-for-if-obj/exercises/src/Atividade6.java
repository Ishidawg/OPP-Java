import Atividade06ClassesObjetos.BankAccount;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();

        System.out.println("Type your bank account number: ");
        bankAccount.setAccountNumber(scanner.nextInt());

        bankAccount.deposit(1800);
        bankAccount.withdraw(50); // to buy Elden Ring Shadow of The Erdtree

        // Checking matters
        System.out.println("Your bank account number: " + bankAccount.getAccountNumber());
        System.out.println("You bank account balance: " + bankAccount.checkBalance());
    }
}
