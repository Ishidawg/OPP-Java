package Atividade05ClassesObjects;

public class Product {

    private String productName;
    private double productPrice;
    private int productQuantity;

    // Constructor Name
    public Product(String productName) {
        this.productName = productName;
        this.productPrice = 0.0;
        this.productQuantity = 0;
    }

    // Constructor Name and Price
    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = 0;
    }

    // Full constructor
    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    // Setter and Getter

    // Name
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    // Price
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    // Quantity
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    // Method
    public void displayProducts() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Product Quantity: " + productQuantity);
    }

}
