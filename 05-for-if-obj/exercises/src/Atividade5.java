import Atividade05ClassesObjetos.Car;
import Atividade05ClassesObjetos.CarTest;

public class Atividade5 {
    public static void main(String[] args) {

        Car a86 = new Car("Toyota", "A86", 1986);
        Car palio = new Car("Fiat", "Palio", 2007);

        CarTest testA86 = new CarTest(a86);
        CarTest testPalio = new CarTest(palio);

        // A86 code
        a86.drift();
        a86.gas();

        // Just break a line between cars actions
        System.out.println();

        // Palio code
        palio.drift();
        palio.gas();

        // Just break a line between Classes
        System.out.println();

        // Identify Car
        System.out.println(a86.model);
        testA86.testGas();

        // Just break a line between Tests
        System.out.println();

        // Identify Car
        System.out.println(palio.model);
        testPalio.testBrake();






    }
}


