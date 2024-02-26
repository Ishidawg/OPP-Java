public class Main {
    public static void main(String[] args) {
        // Character
        String name = "Alexia";
        String conjunction = " from";
        String title = " Riverwood";
        int age = 19;

        //Inventory
        float coins = 27.91F;
        String mainWeapon = "Claymore";
        String sideWeapon = "Iron Dagger";
        boolean haveWater = true;
        boolean haveFood = false;

        //Class & Attributes
        boolean isWarrior = true;
        double healthPoints = 100.00;
        double manaPoints = 23.00;

        //Output
        System.out.println("---------\nCharacter\n---------");
        System.out.println(name + conjunction + title + "\n" + "Age: " + age);
        System.out.println("\n---------\nInvetory\n---------");
        System.out.println("Main Weapon: " + mainWeapon + "\nSecondary Weapon: " + sideWeapon + "\nHave water : " + haveWater + "\nHave Food: " + haveFood);
        System.out.println("\n---------\nCLass & Attributes\n---------");
        System.out.println("Is an Warrior: " + isWarrior + "\nHP: " + healthPoints + "\nMana: " + manaPoints);

    }
}