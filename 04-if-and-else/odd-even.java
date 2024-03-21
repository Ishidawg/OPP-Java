import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double number = 0;
        
        System.out.println("Infome um numero: ");
        number = scanner.nextDouble();
        
        if (number % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
