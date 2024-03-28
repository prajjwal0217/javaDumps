package RationCardDetails;
public class RationCard {
    private String rationCarID;
    private String holderName;
    private String cardColour;
    private double quantity;
    private double price;
    
    public RationCard() {
        super();
    }

    public RationCard(String rationCarID, String holderName, String cardColour, double quantity, double price) {
        this.rationCarID = rationCarID;
        this.holderName = holderName;
        this.cardColour = cardColour;
        this.quantity = quantity;
        this.price = price;
    }

    public String getRationCarID() {
        return rationCarID;
    }

    public void setRationCarID(String rationCarID) {
        this.rationCarID = rationCarID;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCardColour() {
        return cardColour;
    }

    public void setCardColour(String cardColour) {
        this.cardColour = cardColour;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateBillAmount(){
        double totalCost =0;
        if(price <=0 || quantity <=0){
            return -1;
        }
        if(cardColour.equalsIgnoreCase("Pink")){
            totalCost = quantity*(price-(price*0.2));
        }else if(cardColour.equalsIgnoreCase("Blue")){
            totalCost = quantity*(price-(price*0.09));
        }else if(cardColour.equalsIgnoreCase("Blue")){
            totalCost = quantity*(price-(price*0.15));
        }else{
            return -1;
        }
        return totalCost;
    }
    

    
}
