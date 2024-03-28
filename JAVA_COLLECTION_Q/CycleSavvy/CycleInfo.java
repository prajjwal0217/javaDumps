

public class CycleInfo {
    private String cycleId;
    private String cycleName;
    private String cycleType;
    private String accessories;
    private double price;

    
    public CycleInfo() {
        super();
    }
    
    public CycleInfo(String cycleId, String cycleName, String cycleType, String accessories, double price) {
        super();
        this.cycleId = cycleId;
        this.cycleName = cycleName;
        this.cycleType = cycleType;
        this.accessories = accessories;
        this.price = price;
    }

    public String getCycleId() {
        return cycleId;
    }
    public String getCycleName() {
        return cycleName;
    }
    public String getCycleType() {
        return cycleType;
    }
    public String getAccessories() {
        return accessories;
    }
    public double getPrice() {
        return price;
    }

    public void setCycleId(String cycleId) {
        this.cycleId = cycleId;
    }

    public void setCycleName(String cycleName) {
        this.cycleName = cycleName;
    }

    public void setCycleType(String cycleType) {
        this.cycleType = cycleType;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateBillAmount(){
        
        double totalCost =0;
        if(price <=0){
            return -1;
        }
        if(cycleType.equals("Road Cycle")){
            totalCost = price + ((price*2)/100);
        }else if(cycleType.equals("Mountain Cycle")){
            totalCost = price + ((price*5)/100);
        }else if(cycleType.equals("Hybrid Cycle")){
            totalCost = price + ((price*6)/100);
        }else if(cycleType.equals("Touring Cycle")){
            totalCost = price + ((price*4)/100);
        }else if(cycleType.equals("Electric Cycle")){
            totalCost = price + ((price*3)/100);
        }else{
            return -1;
        }
        
        if(accessories.equalsIgnoreCase("yes")){
            totalCost = totalCost+1000;
        }else if(accessories.equalsIgnoreCase("no")){
            return totalCost;
        }else{
            return -1;
        }

        return totalCost;
    }
}
