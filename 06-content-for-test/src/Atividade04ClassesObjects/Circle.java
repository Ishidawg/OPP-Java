package Atividade04ClassesObjects;

public class Circle {
    private double radius;
    private String color;
    private double area;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter and Setter

    //Radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Color
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Area
    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    // Method

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }
}
