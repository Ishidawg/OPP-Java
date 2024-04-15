import Atividade02ClassesObjects.Products;

public class Atividade02 {
    public static void main(String[] args) {
        Products game01 = new Products(
                "Dragon's Dogma 2",
                50,
                50
        );

        Products game02 = new Products(
                "Elden Ring DLC",
                50,
                50
        );

        System.out.println("Dragon's Dogma 2");
        System.out.println("name: " + game01.getname());
        System.out.println("Price: " + game01.getPrice());
        System.out.println("Storage: " + game01.getStorageQuantity());
        System.out.println("\n");

        System.out.println("Elden Ring: Shadow of the Erdtree");
        System.out.println("name: " + game02.getname());
        System.out.println("Price: " + game02.getPrice());
        System.out.println("Storage: " + game02.getStorageQuantity());
        System.out.println("\n");

        System.out.println("=======================================");
        System.out.println("SUMMER SALE!");
        System.out.println("Elden Ring: Shadow of the Erdtree SOLD OUT");
        System.out.println("But we have Fallout 76!!!!!");
        System.out.println("=======================================");
        System.out.println();
        // Discounts
        game01.setPrice(39);
        game02.setPrice(39);

        //Set another game
        game02.setname("Fallout 76: The Pitt Deluxe Edition");

        System.out.println(game02.getname() + " just arrived with the tv shows being a success!");
        System.out.println("Price: " + game02.getPrice());
        System.out.println(game01.getname() + " DISCOUNT!!");
        System.out.println("Price: " + game01.getPrice());
    }
}
