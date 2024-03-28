package OrcristWatch;
import java.util.Scanner;

public class UserInterface {
    public static OrderInfo extractDetails(String orderDetails){

        String info[] = orderDetails.split(":");
        OrderInfo obj = new OrderInfo(info[0],info[1],info[2],Integer.parseInt(info[3]));
        return obj;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String orderDetails = s.nextLine();
        OrderInfo obj = new OrderInfo();
        obj = extractDetails(orderDetails);
        if(obj.calculateWatchCost() == -1){
            System.out.println("Invalid details");
        }else{
            System.out.println("Order Id: "+obj.getOrderId());
            System.out.println("Customer Name: "+obj.getCustomerName());
            System.out.println("Watch Model: "+obj.getWatchModel());
            System.out.println("Quantity: "+obj.getQuantity());
            System.out.println("Total cost to be paid: "+obj.calculateWatchCost());
        }
        s.close();
    }
}
