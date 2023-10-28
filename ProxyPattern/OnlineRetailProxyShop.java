class OnlineRetailProxyShop implements OnlineRetailShop{
    private RealOnlineShop realShop;

    public OnlineRetailProxyShop(){
        realShop = new RealOnlineShop();
    }
    

    public String getProductInformation(String PID){
        return realShop.getProductInformation(PID);
    }

    public int checkInventory(String PID){
        return realShop.checkInventory(PID);
    }

    public void addProduct(String PID, String information, int initialInventory){
        realShop.addProduct(PID,information,initialInventory);
    }
    }

