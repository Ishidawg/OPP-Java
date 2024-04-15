package Atividade02ClassesObjects;

public class Products {
    private String name;
    private double price;
    private int storageQuantity;

    public Products(String name, double price, int storageQuantity) {
        this.name = name;
        this.price = price;
        this.storageQuantity = storageQuantity;
    }

    // Setter and Getter

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setStorageQuantity(int storageQuantity) {
        this.storageQuantity = storageQuantity;
    }

    public int getStorageQuantity() {
        return storageQuantity;
    }

    public void addToStorageQuantity(int quantity) {
        this.storageQuantity += quantity;
    }

    public void subFromStorageQuantity(int quantity) {
        this.storageQuantity -= quantity;
    }
}
