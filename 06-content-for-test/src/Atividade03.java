import Atividade03ClassesObjetcs.Products;

public class Atividade03 {
    public static void main(String[] args) {

        Products product01 = new Products("Fallout 4", 50, 100);
        Products product02 = new Products("Fallout 76", 50, 100);
        Products product03 = new Products("Dark Souls 2 Vanilla", 50, 100);

        System.out.println("============ PRODUCTS ============");
        product01.displayProduct();
        System.out.println();
        product02.displayProduct();
        System.out.println();
        product03.displayProduct();
        System.out.println("==================================");

        System.out.println();

        product02.setProductQuantity(50);
        System.out.println("Fallout 76 has 50% SOLD OUT, RUN FOR YOUR GAMES!!!");
        product02.displayProduct();

        System.out.println();

        product03.setProductPrice(120);
        System.out.println("Fromsoftware fuckedup prices and price has increased!!");
        product03.displayProduct();

    }
}
