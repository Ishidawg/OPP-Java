import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = 0;
        
        System.out.println("Infome sua idade: ");
        age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("Voce eh maior de idade");
        } else {
            System.out.println("Voce eh menor de idade");
        }
    }
}
