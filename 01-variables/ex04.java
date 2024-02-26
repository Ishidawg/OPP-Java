public class ControleEstoque {
    public static void main(String[] args) {
        // drinks
        
        String energyDrink = "Monster";
        String energyDrinkCategory = "drinks";
        double energyDrinkPrice = 10.00;
        int energyDrinkQuantity = 64;
        
        // food
        
        String deliciousPizza = "Pepperoni pizza";
        String deliciousPizzaCategory = "food";
        double deliciousPizzaPrice = 32.00;
        int deliciousPizzaQuantity = 12;
        
        // hygiene
        
        String niceSoap = "Dove soap";
        String niceSoapCategory = "hygiene";
        double niceSoapPrice = 8.00;
        int niceSoapQuantity = 102;
        
       //Output vo coloca valor monetario nao
        System.out.println("---------\nDrinks\n---------");
        System.out.println("Drink: " + energyDrink + "\nCategory: " + energyDrinkCategory+ "Price : " + energyDrinkPrice + "\nQuantity: " + energyDrinkQuantity);
        
        System.out.println("\n---------\nFoods\n---------");
        System.out.println("Food: " + deliciousPizza + "\nCategory: " + deliciousPizzaCategory+ "Price : " + deliciousPizzaPrice + "\nQuantity: " + deliciousPizzaQuantity);
        
        System.out.println("\n---------\nHygiene\n---------");
        System.out.println("Hygiene: " + niceSoap + "\nCategory: " + niceSoapCategory+ "Price : " + niceSoapPrice + "\nQuantity: " + niceSoapQuantity);
    }
}
