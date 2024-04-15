import Atividade05ClassesObjects.Product;

public class Atividade05 {

    public static void main(String[] args) {

        Product productJustName = new Product("Generic 00's rock album");
        Product productJustNameAndPrice = new Product("Generic 80's jazz album", 20);
        Product productFull = new Product("Generic 50's alien beat album", 20, 999);

        System.out.println("======== PRODUCTS =======");
        System.out.println("Name: " + productJustName.getProductName());
        System.out.println("Price: " + productJustName.getProductPrice());
        System.out.println("Quantity: " + productJustName.getProductQuantity());
        System.out.println();
        System.out.println("Name: " + productJustNameAndPrice.getProductName());
        System.out.println("Price: " + productJustNameAndPrice.getProductPrice());
        System.out.println("Quantity: " + productJustNameAndPrice.getProductQuantity());
        System.out.println();
        System.out.println("Name: " + productFull.getProductName());
        System.out.println("Price: " + productFull.getProductPrice());
        System.out.println("Quantity: " + productFull.getProductQuantity());
        System.out.println("=========================");

        // Just testing if I can modify values that are not in construct params.
        System.out.println();
        System.out.println("========= TEST =========");
        productJustName.setProductPrice(9999);
        productJustName.setProductQuantity(69);
        System.out.println("Name: " + productJustName.getProductName());
        System.out.println("Price: " + productJustName.getProductPrice());
        System.out.println("Quantity: " + productJustName.getProductQuantity());
        System.out.println("========================");

        // Yes it's possible, cool :)
    }
}
