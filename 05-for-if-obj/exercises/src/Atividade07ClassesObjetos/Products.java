package Atividade07ClassesObjetos;

public class Products {
    private int id;
    private String description;
    private double price;
    private int storageQuantity;

    public Products(int id, String description, double price, int storageQuantity) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.storageQuantity = storageQuantity;
    }

    // Setter and Getter

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
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
