public class ControleEstoqueEletronicos {
    public static void main(String[] args) {
        // Smartphone
        
        String phoneName = "Pixel 8";
        String phoneBranding = "Google";
        double phonePrice = 500.00;
        int phoneQuantity = 64;
        
        // Laptop
        
        String laptopName = "thinkpad e14";
        String laptopBranding = "Lenovo";
        double laptopPrice = 400.00;
        int laptopQuantity = 12;
        
        // bluetooth headphone
        
        String headphoneName = "HD 599";
        String headphoneBranding = "Sennheiser";
        double headphonePrice = 399.67;
        int headphoneQuantity = 102;
        
       //Output vo coloca valor monetario nao
        System.out.println("------------------\nSmartphone\n------------------");
        System.out.println("Name: " + phoneName);
        System.out.println("Company: " + phoneBranding);
        System.out.println("Price: " + phonePrice);
        System.out.println("Quantity: " + phoneQuantity);
        
        System.out.println("\n------------------\nLaptop\n------------------");
        System.out.println("Name: " + laptopName);
        System.out.println("Company: " + laptopBranding);
        System.out.println("Price: " + laptopPrice);
        System.out.println("Quantity: " + laptopQuantity);
        
        System.out.println("\n------------------\nBluetooth Headphone\n------------------");
        System.out.println("Name: " + headphoneName);
        System.out.println("Company: " + headphoneBranding);
        System.out.println("Price: " + headphonePrice);
        System.out.println("Quantity: " + headphoneQuantity);
    }
}
