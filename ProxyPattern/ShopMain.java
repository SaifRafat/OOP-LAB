public class ShopMain {

    public static void main(String[] args){
        OnlineRetailProxyShop proxy = new OnlineRetailProxyShop();

        proxy.addProduct("234", "Product A: Description", 140);
        proxy.addProduct("764", "Product B: Description", 50);

        String productInfo = proxy.getProductInformation("764");
        int inventory = proxy.checkInventory("764");

        System.out.println("Product Information: " + productInfo);
        System.out.println("Inventory Count: "+inventory);
    }
}