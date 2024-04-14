class Car {
    public String color;
    public int doors;
    public int horsepower;
    public int age;

    public Car(String color, int doors, int horsepower, int age) {
        this.color = color;
        this.doors = doors;
        this.horsepower = horsepower;
        this.age = age;
    }

    public void drive() {
        System.out.println("The car is driving.");
    }

    public void drift() {
        System.out.println("The car is drifting!");
    }

    public void shiftGear() {
        System.out.println("Gear shifted.");
    }

    public void gas() {
        System.out.println("Gas pedal pressed.");
    }

    public void brake() {
        System.out.println("Brake pedal pressed.");
    }
}

class TestCar {
    Car car;

    public TestCar(Car car) {
        this.car = car;
    }

    public void driveTenMiles() {
        System.out.println("Driving for ten miles...");
        car.drive();
    }

    public void brakeAtFifty() {
        System.out.println("Approaching 50 mph. Preparing to brake...");
        car.brake();
    }
}

public class Atividade5 {
    public static void main(String[] args) {
        Car myCar = new Car("Red", 4, 300, 5);

        TestCar test = new TestCar(myCar);

        test.driveTenMiles();

        test.brakeAtFifty();
        
        System.out.println("Let's have some fun!");
        myCar.drift();
        myCar.shiftGear();
        myCar.gas();
    }
}


