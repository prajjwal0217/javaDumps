package MaxFitEquipments;
import java.util.Scanner;

public class UserInterface {
    public static CustomerInfo extractDetails(String customerDetails){
        String info[] = customerDetails.split(":");
        CustomerInfo obj = new CustomerInfo(info[0],info[1],info[2],info[3],Integer.parseInt(info[4]),Integer.parseInt(info[5]));
        return obj;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String customerDetails = s.nextLine();
        CustomerInfo obj = new CustomerInfo();
        obj = extractDetails(customerDetails);
        if(obj.calculateBillAmount() == 0){
            System.out.println("Invalid Details");
        }else{
            System.out.println("Customer Id: "+obj.getCustomerId());
            System.out.println("Customer Name: "+obj.getCustomerName());
            System.out.println("Phone Number: "+obj.getPhoneNumber());
            System.out.println("Product Name: "+obj.getProductName());
            System.out.println("Maximium Weiight: "+obj.getMaxWeight());
            System.out.println("Daily Workout Hours: "+obj.getDailyWorkutHours());
            System.out.println("Bill Amount: $"+obj.calculateBillAmount());
        }
        s.close();

    }
}
