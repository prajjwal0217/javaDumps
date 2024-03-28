package RationCardDetails;
import java.util.Scanner;

public class UserInterface {
    public static RationCard extractDetails(String rationDetails){
        String info[] = rationDetails.split(":");
        RationCard obj = new RationCard(info[0],info[1],info[2],Double.parseDouble(info[3]),Double.parseDouble(info[4]));
        return obj;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rationDetails = s.nextLine();
        RationCard obj = new RationCard();
        obj = extractDetails(rationDetails);
        if(obj.calculateBillAmount() == -1){
            System.out.println("Invalid Details");
        }else{
            System.out.println("Ration Card Id"+obj.getRationCarID());
            System.out.println("Holder Name"+obj.getHolderName());
            System.out.println("Card Color"+obj.getCardColour());
            System.out.println("Quantity"+obj.getQuantity());
            System.out.println("Price"+obj.getPrice());
            System.out.println("Amount to be paid by the Customer "+obj.calculateBillAmount());
        }
        s.close();

    }
}
