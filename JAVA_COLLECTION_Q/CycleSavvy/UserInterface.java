
import java.util.*;
public class UserInterface {
    
    public static CycleInfo extractDetails(String cycleDetails){
        
        String info[] = cycleDetails.split(":");
        CycleInfo obj = new CycleInfo(info[0],info[1],info[2],info[3],Double.parseDouble(info[4]));
        return obj;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the cycle details");
        String info = s.nextLine();
        CycleInfo obj = new CycleInfo();
        obj = extractDetails(info);
        if(obj.calculateBillAmount() == -1){
            System.out.println("Invalid Cycle details");
            System.exit(0);
        }else{
        System.out.println("Cycle Details");
        System.out.println("Cycle ID:"+obj.getCycleId());
        System.out.println("Cycle Name:"+obj.getCycleName());
        System.out.println("Cycle Type:"+obj.getCycleType());
        System.out.println("Wanted Accessories:"+obj.getAccessories());
        System.out.println("Cycle Price:"+obj.getPrice());
        System.out.println("Bill amount to be paid:"+obj.calculateBillAmount());
        }
        
        s.close();
    }
}
