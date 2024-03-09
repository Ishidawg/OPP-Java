// O problema estava na ordem das informações (inputs).
// onde antes começava pela idade, dai peso e por último nome.
// no caso agora, coloquei o nome para ser o primeiro input.
// ok, mas pq estava dando erro afinal?
// o nextDouble acaba por "identificar" dois espaços quando damos quanlquer input em nextDouble
// então ao invés de pegar o último input, que era nome, ele simplesmente gravava uma String vazia.
// pois era um duplo "Enter"

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        String nome = "";
        int idade = 0;
        double peso = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seus dados:  ");
        nome = scanner.nextLine();
        idade = scanner.nextInt();
        peso = scanner.nextDouble();
        
        scanner.close();
        
        System.out.println("Nome "+ nome);
        System.out.println("idade "+ idade);
        System.out.println("peso "+ peso);
    }
}
