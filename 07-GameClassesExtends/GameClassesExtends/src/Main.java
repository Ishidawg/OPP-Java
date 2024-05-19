import scripts.entities.enemy.Enemy;
import scripts.entities.player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        String equipNewWeapon;
        String battleBoss;

        Player player = new Player(100.00, "Marston", "Claymore", "Leather armor");
        Enemy enemy = new Enemy(50.00, "Iron dagger", "Ebony Set");

        //PLayer Info and simulation
        System.out.println("Name: " + player.getName());
        System.out.println("Health: " + player.getHealth());
        System.out.println("Weapon: " + player.getInitalWeapon());
        System.out.println("Armor: " + player.getInitialArmor());

        System.out.println("\n==============================================");
        System.out.println("The adventure begins!");
        System.out.println("==============================================");

        System.out.println("Your player have found another weapon, its a Flamberge sword, want to equipt it? Y/N: ");
        equipNewWeapon = scanner.nextLine();

        if (equipNewWeapon.equalsIgnoreCase("y")) {
            player.setInitalWeapon("Flamberge");
            System.out.println("\nYour weapon now is: " + player.getInitalWeapon());
        } else {
            System.out.println("\nYou choose not change your weapon");
        }

        System.out.println("\n\nWalking down the road u encounter the terrify Uranus!");
        System.out.println("Want to battle with him? Probably if u try to run, he will cut your back... Y/N: ");
        battleBoss = scanner.nextLine();

        if (battleBoss.equalsIgnoreCase("y")) {

            System.out.println("You choose to battle him! Prepare he's attacking!!!!");

            int enemyDamage = (int) (Math.random() * 99 + 1);
            int chanceToBlock = (int) (Math.random() * 99 + 1);

            if (enemyDamage > chanceToBlock) {
                player.setHealth(0.00);

                System.out.println("\nGame over... You died, Your health is: " + player.getHealth());
            } else {
                System.out.println("\nLucky as hell!!!! You are alive!!");
                System.out.println("Your health is: " + player.getHealth());
            }

        } else {

            int enemyAggro = (int) (Math.random() * 99 + 1);
            int chanceToEscape = (int) (Math.random() * 99 + 1);

            if (enemyAggro > chanceToEscape) {
                player.setHealth(0.00);

                System.out.println("\n Game Over... You try to scape, but you got struggling on vines on the ground and fall into broken logs... then Uranus killed you");

            } else {

                System.out.println("\n You are alive! You are alive!! You figure it out how to escape from the beast!!");

            }

        }
    }
}