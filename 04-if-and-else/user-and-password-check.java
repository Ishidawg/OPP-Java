import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String user = "";
        String password = "";
        
        System.out.println("Infome o usuario: ");
        user = scanner.next();
        
        System.out.println("Infome a senha: ");
        password = scanner.next();
        
        if (user.equals("usuario") && password.equals("senha123")) {
            System.out.println("Login bem-sucedido");
        } else {
            System.out.println("Nome de usuario ou senha incorretos");
        }
    }
}
