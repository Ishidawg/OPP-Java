package Atividade01ClassesObjetcs;

public class Car {

    private String make;
    private String model;
    private int year;
    private String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Setter and Getters

    // Make
    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    // Model
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    // Year
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    // Color
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Method
    public void showCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

}
