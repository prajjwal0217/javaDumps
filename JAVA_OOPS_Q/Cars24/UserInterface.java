package Cars24;
import java.util.*;

public class UserInterface {
    
    public static CarInfo extractDetails(String carDetails){
        
        String info[] = carDetails.split(":");
        CarInfo obj = new CarInfo(info[0],info[1],info[2],info[3]);
        return obj;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String carDetails = s.nextLine();
        CarInfo obj = new CarInfo();
        obj = extractDetails(carDetails);
        if(obj.checkAvailability() == "Not Available"){
            System.out.println("Invalid Details");
        }else{
            System.out.println("Car ID: "+obj.getCarId());
            System.out.println("Car Name: "+obj.getCarName());
            System.out.println("Car Type: "+obj.getCarType());
            System.out.println("City: "+obj.getCity());
            System.out.println("Available car and price is: "+obj.checkAvailability());
        }
        s.close();
    }
}
