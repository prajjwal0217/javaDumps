package OrcristWatch;

import javax.swing.text.AbstractDocument.LeafElement;

public class OrderInfo{
    private String orderId;
    private String customerName;
    private String watchModel;
    private int quantity;
    
    public OrderInfo() {
        super();
    }

    public OrderInfo(String orderId, String customerName, String watchModel, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.watchModel = watchModel;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getWatchModel() {
        return watchModel;
    }

    public void setWatchModel(String watchModel) {
        this.watchModel = watchModel;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateWatchCost(){
        if(quantity <=0){
            return -1;
        }
        if(watchModel.equalsIgnoreCase("OrcristVox2")){
            return quantity*5200;
        }else if(watchModel.equalsIgnoreCase("OrcristVox1")){
            return quantity*4600;
        }else if(watchModel.equalsIgnoreCase("OrcristTrx1000")){
            return quantity*3200;
        }else if(watchModel.equalsIgnoreCase("OrcristRvs2")){
            return quantity*2500;
        }else{
            return -1;
        }

        
    

    
}
