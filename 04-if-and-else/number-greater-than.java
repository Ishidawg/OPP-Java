import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double firstNumber = 0;
        double secondNumber = 0;
        
        System.out.println("Infome o primeiro numero: ");
        firstNumber = scanner.nextDouble();
        
        System.out.println("Infome o segundo numero: ");
        secondNumber = scanner.nextDouble();
        
        if (firstNumber > secondNumber) {
            System.out.println("O numero " + firstNumber + " eh maior");
        } else {
            System.out.println("O numero " + secondNumber + " eh maior");
        }
    }
}
