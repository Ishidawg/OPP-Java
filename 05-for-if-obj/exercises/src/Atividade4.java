import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20]; // Array to store 20 integers

        // Prompt user to enter 20 numbers
        System.out.println("Please enter 20 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Read each number and store in array
        }
        scanner.close();

        for (int number : numbers) {

            if (number >= 0  && number <= 100) {
                System.out.println("\nNumbers between 0 and 100");
                System.out.println(number);
            }
        }

        for (int number : numbers) {

            if (number >= 101 && number <= 200) {
                System.out.println("\nNumbers between 101 and 200");
                System.out.println(number);
            }
        }

        for (int number : numbers) {
            if (number >= 200) {
                System.out.println("\nNumbers greater than 200");
                System.out.println(number);
            }
        }
    }
}
