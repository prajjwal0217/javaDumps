package ToThePoint;
public class Courier {
    private String coureierId;
    private String receiverName;
    private String receiverAddress;
    private String courierType;
    private int noOfPackage;
    
    public Courier() {
    }

    public Courier(String coureierId, String receiverName, String receiverAddress, String courierType,
            int noOfPackage) {
        this.coureierId = coureierId;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        this.courierType = courierType;
        this.noOfPackage = noOfPackage;
    }

    public String getCoureierId() {
        return coureierId;
    }

    public void setCoureierId(String coureierId) {
        this.coureierId = coureierId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getCourierType() {
        return courierType;
    }

    public void setCourierType(String courierType) {
        this.courierType = courierType;
    }

    public int getNoOfPackage() {
        return noOfPackage;
    }

    public void setNoOfPackage(int noOfPackage) {
        this.noOfPackage = noOfPackage;
    }
    
    public double calculateAmountToBePaid(){

        double totalCost =0;
        if(noOfPackage <=0){
            return -1;
        }
        if(courierType.equalsIgnoreCase("Standard")){
            totalCost = noOfPackage*230;
        }else if(courierType.equalsIgnoreCase("Express")){
            totalCost = noOfPackage*250;
        }else if(courierType.equalsIgnoreCase("OverNight")){
            totalCost = noOfPackage*500;
        }else if(courierType.equalsIgnoreCase("SameDay")){
            totalCost = noOfPackage*650;
        }else if(courierType.equalsIgnoreCase("OnDemand")){
            totalCost = noOfPackage*450;
        }else{
            return -1;
        }
        return totalCost;
    }
}
