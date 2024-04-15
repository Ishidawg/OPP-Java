import Atividade01ClassesObjetcs.Car;

public class Atividade01 {
    public static void main(String[] args) {

        Car palio = new Car("Fiat", "Palio", 2007, "Red");
        Car prelude = new Car("Honda", "Prelude", 1998, "White");

        palio.showCarInfo();
        System.out.println();
        prelude.showCarInfo();
        System.out.println();

        System.out.println("Prelude has a new color!");
        prelude.setColor("Yellow");
        prelude.showCarInfo();
    }
}