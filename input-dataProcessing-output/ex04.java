import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double notaUm = 0.0;
        double notaDois = 0.0;
        double notaTres = 0.0;
        double notaQuatro = 0.0;
        
        System.out.println("Informe a primeira nota: ");
        notaUm = scanner.nextDouble();
        System.out.println("Informe o segundo valor: ");
        notaDois = scanner.nextDouble();
        System.out.println("Informe a terceira nota: ");
        notaTres = scanner.nextDouble();
        System.out.println("Informe a quarta nota: ");
        notaQuatro = scanner.nextDouble();
        
        scanner.close();
        
        double media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
        
        System.out.println("Mehdia igual a: " + media);
    }
}
