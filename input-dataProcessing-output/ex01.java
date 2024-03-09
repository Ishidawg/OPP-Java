import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double valorUm = 0.0;
        double valorDois = 0.0;
        double valorTres = 0.0;
        
        System.out.println("Informe o primeiro valor: ");
        valorUm = scanner.nextDouble();
        System.out.println("Informe o segundo valor: ");
        valorDois = scanner.nextDouble();
        System.out.println("Informe o terceiro valor: ");
        valorTres = scanner.nextDouble();
        
        scanner.close();
        
        double soma = valorUm + valorDois + valorTres;
        
        System.out.println("A soma dos valores eh: " + soma);
    }
}
