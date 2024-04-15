package Atividade05ClassesObjetos;

public class Car {

    public String make;
    public String model;
    public int year;


    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void drift() {
        System.out.println(this.model + " is drifiting asf");
    }

    public void gas() {
        System.out.println(this.model + " is gas gas gas tu tu tu tu tu");
    }

    public void brake() {
        System.out.println(this.model + " is brakeing asf");
    }
}
