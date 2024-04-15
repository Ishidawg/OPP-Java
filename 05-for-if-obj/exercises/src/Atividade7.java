import Atividade07ClassesObjetos.Products;

public class Atividade7 {
    public static void main(String[] args) {
        Products dragonsDogma2 = new Products(
                1,
                "Open world action adventure rpg, successor of Dragon's Dogma 1 from 2012.",
                50,
                99
        );

        Products eldenringDlc = new Products(
                2,
                "Shadow of the Erdtree, new content for Elden Ring! Finally!",
                50,
                99
        );

        System.out.println("Dragon's Dogma 2");
        System.out.println("Description: " + dragonsDogma2.getDescription());
        System.out.println("Price: " + dragonsDogma2.getPrice());
        System.out.println("Storage: " + dragonsDogma2.getStorageQuantity());
        System.out.println("\n");

        System.out.println("Elden Ring: Shadow of the Erdtree");
        System.out.println("Description: " + eldenringDlc.getDescription());
        System.out.println("Price: " + eldenringDlc.getPrice());
        System.out.println("Storage: " + eldenringDlc.getStorageQuantity());
        System.out.println("\n");

        System.out.println("SUMMER SALE!");
        // Discounts
        dragonsDogma2.setPrice(39);
        eldenringDlc.setPrice(39);

        System.out.println("Elden Ring DLC DISCOUNT!!");
        System.out.println("Description: " + eldenringDlc.getPrice());
        System.out.println("Dragon's Dogma 2 DISCOUNT!!");
        System.out.println("Price: " + dragonsDogma2.getPrice());
    }
}
