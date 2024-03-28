package ToThePoint;
import java.util.Scanner;

public class UserInterface {
    public static Courier extractDetails(String courierDetails){
        String info[] = courierDetails.split(":");
        Courier obj = new Courier(info[0],info[1],info[2],info[3],Integer.parseInt(info[4]));
        return obj;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Courier Details");
        String courierDetails = s.nextLine();
        Courier obj = new Courier();
        obj = extractDetails(courierDetails);
        if(obj.calculateAmountToBePaid() == -1){
            System.out.println("Invalid Courier Details");
        }else{
            System.out.println("Courier Type: "+obj.getCourierType());
            System.out.println("Receiver Name: "+obj.getReceiverName());
            System.out.println("Receiver Address: "+obj.getReceiverAddress());
            System.out.println("Courier Type: "+obj.getCourierType());
            System.out.println("No Of Packages: "+obj.getNoOfPackage());
            System.out.println("Amount to be paid by the Customer: "+obj.calculateAmountToBePaid());
        }
        s.close();
    }
}
