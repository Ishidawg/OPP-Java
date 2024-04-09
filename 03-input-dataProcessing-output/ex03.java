import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double notaUm = 0.0;
        double notaDois = 0.0;
        
        System.out.println("Informe o primeiro valor: ");
        notaUm = scanner.nextDouble();
        System.out.println("Informe o segundo valor: ");
        notaDois = scanner.nextDouble();
        scanner.close();
        
        double media = (notaUm + notaDois) / 2;
        
        System.out.println("Mehdia igual a: " + media);
    }
}
