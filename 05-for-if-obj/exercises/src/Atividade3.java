//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = 0;
        int month = 0;
        int day = 0;
        int result = 0;

        System.out.println("Type your age in years, months and days, like: 3 years, 2 months and 4 days");
        System.out.print("Enter your age: ");
        year = scanner.nextInt();
        System.out.print("Enter your month: ");
        month = scanner.nextInt();
        System.out.print("Enter your day: ");
        day = scanner.nextInt();

        result = (year * 365 + month * 30 + day);

        System.out.println("You are " + result + " days old");

    }
}
