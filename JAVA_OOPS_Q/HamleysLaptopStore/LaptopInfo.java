public class LaptopInfo {
    private String laptopId;
    private String modelName;
    private String brandName;
    private double cost;

    public LaptopInfo() {
    }
    
    public LaptopInfo(String laptopId, String modelName, String brandName, double cost) {
        this.laptopId = laptopId;
        this.modelName = modelName;
        this.brandName = brandName;
        this.cost = cost;
    }

    public String getLaptopId() {
        return laptopId;
    }
    public void setLaptopId(String laptopId) {
        this.laptopId = laptopId;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public double calculateLaptopCost(){
        
        double totalcost =0;
        if(cost <=0){
            return -1;
        }
        if(brandName.equalsIgnoreCase("Apple")){
            totalcost = cost- (cost*0.05);
        }else if(brandName.equalsIgnoreCase("Dell")){
            totalcost = cost- (cost*0.1);
        }else if(brandName.equalsIgnoreCase("Samsung")){
            totalcost = cost- (cost*0.15);
        }else if(brandName.equalsIgnoreCase("Lenovo")){
            totalcost = cost- (cost*0.2);
        }else{
            return -1;
        }
        return totalcost;
    }
}
