import java.util.Scanner;

class HelloWorld {
    static void shit(double a, double b) {
        double sum = a + b;
        double sub = a - b;
        double mult = a * b;
        double div = a / b;
        
        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
        System.out.println("mult: " + mult);
        System.out.println("div: " + div);
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double firstNum = 0.0;
        double secNum = 0.0;
        
        System.out.println("First number: ");
        firstNum = scanner.nextDouble();
        System.out.println("Second number: ");
        secNum = scanner.nextDouble();
        
        scanner.close();
        
        shit(firstNum, secNum);
    }
}
