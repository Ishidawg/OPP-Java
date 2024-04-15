import Atividade04ClassesObjects.Circle;
import java.util.Scanner;


public class Atividade04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========Type your circle info========");
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the color of the circle: ");
        String color = scanner.next();

        Circle circle = new Circle(radius, color);

        System.out.println();
        System.out.println("The radius of the circle is " + circle.getRadius());
        System.out.println("The color of the circle is " + circle.getColor());
        System.out.println();

        System.out.println("If you want te calculate the area, press 1");
        String option = scanner.next();

        if (option.equals("1")) {
            circle.calculateArea();

            if (circle.getArea() == Math.PI * radius * radius) {
                System.out.println("The area of the circle is the same as the radius");
            }
        }


    }

}
