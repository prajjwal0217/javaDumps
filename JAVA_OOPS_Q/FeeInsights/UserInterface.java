package FeeInsights;
import java.util.Scanner;

public class UserInterface {
    public static Transaction extractDetails(String transactionDetalis){

        String info[] =transactionDetalis.split(":");
        Transaction obj = new Transaction(info[0],info[1],info[2],info[3],Double.parseDouble(info[4]));
        return obj;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Transaction Details");
        String transactionDetails = s.nextLine();
        Transaction obj = new Transaction();
        obj = extractDetails(transactionDetails);
        if(obj.calculatePlatformFee() == -1){
            System.out.println("Invalid Transaction details");
        }else{
            System.out.println("Transaction Details");
            System.out.println("Mobile Number: "+obj.getMobileNumber());
            System.out.println("Bank Name: "+obj.getBankName());
            System.out.println("IFSC Code: "+obj.getIfscCode());
            System.out.println("Paltform: "+obj.getPlatform());
            System.out.println("Amount: "+obj.getAmount());
            System.out.println("Platform Fee: "+obj.calculatePlatformFee());
            s.close();
        }
    }
}
