import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String productName = "";
        double productPrice = 0.0;
        double productPriceDiscount = 0.0;
        double discount = 0.0;
        
        
        System.out.println("Product name: ");
        productName = scanner.nextLine();
        System.out.println("Product price: ");
        productPrice = scanner.nextDouble();
        System.out.println("Discount: ");
        discount = scanner.nextDouble();
        
        scanner.close();
        
        productPriceDiscount = (discount / 100) * productPrice;
        
        System.out.println("Product: " + productName);
        System.out.println("Default price: " + productPrice);
        System.out.println("DISCOUNT PRICE: " + productPriceDiscount);
    }
}
