import java.util.HashMap;
import java.util.Map;

class RealOnlineShop implements OnlineRetailShop {
    private Map<String,String> productInfo;
    private Map<String,Integer> inventory;

    public RealOnlineShop(){
        productInfo = new HashMap<>();
        inventory = new HashMap<>();
    }

    public String getProductInformation(String PID){
        return productInfo.get(PID);
    }

    public int checkInventory(String PID){
        return inventory.getOrDefault(PID, null);
    }

    public void addProduct(String PID, String information, int initialInventory){
        productInfo.put(PID, information);
        inventory.put(PID, initialInventory);
    }
}