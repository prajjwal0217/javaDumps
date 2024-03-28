package MaxFitEquipments;
public class CustomerInfo {
    private String customerId;
    private String customerName;
    private String phoneNumber;
    private String productName;
    private int maxWeight;
    private int dailyWorkutHours;
    
    public CustomerInfo() {
    }

    public CustomerInfo(String customerId, String customerName, String phoneNumber, String productName, int maxWeight,
            int dailyWorkutHours) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.productName = productName;
        this.maxWeight = maxWeight;
        this.dailyWorkutHours = dailyWorkutHours;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getDailyWorkutHours() {
        return dailyWorkutHours;
    }

    public void setDailyWorkutHours(int dailyWorkutHours) {
        this.dailyWorkutHours = dailyWorkutHours;
    }

    public double calculateBillAmount(){
        double billAmount =0;
        if(productName.equalsIgnoreCase("Tread Mill")){
            if(maxWeight <= 140){
                if(dailyWorkutHours <=4){
                    billAmount = 14999 + 14999*0.17;
                }else if(dailyWorkutHours >4 && dailyWorkutHours <=8){
                    billAmount = 19999 + 19999*0.17;
                }else if(dailyWorkutHours >8 && dailyWorkutHours <=13){
                    billAmount = 24999 + 24999*0.17;
                }else{
                    return 0;
                }
            }else{
                return 0;
            }
        }else if(productName.equalsIgnoreCase("Elliptical Trainer")){
            if(maxWeight <= 120){
                if(dailyWorkutHours <=4){
                    billAmount = 9599 + 9599*0.17;
                }else if(dailyWorkutHours >4 && dailyWorkutHours <=8){
                    billAmount = 12599 + 12599*0.17;
                }else if(dailyWorkutHours >8 && dailyWorkutHours <=13){
                    billAmount = 14999 + 14999*0.17;
                }else{
                    return 0;
                }
            }else{
                return 0;
            }
        }else if(productName.equalsIgnoreCase("Air Bike")){
            if(maxWeight <= 100){
                if(dailyWorkutHours <=4){
                    billAmount = 4999 + 4999*0.17;
                }else if(dailyWorkutHours >4 && dailyWorkutHours <=8){
                    billAmount = 7499 + 7499*0.17;
                }else if(dailyWorkutHours >8 && dailyWorkutHours <=13){
                    billAmount = 9999 + 9999*0.17;
                }else{
                    return 0;
                }
            }else{
                return 0;
            }
        }
        return billAmount;
    }
    
}
