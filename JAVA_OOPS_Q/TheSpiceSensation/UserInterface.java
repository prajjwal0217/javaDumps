package TheSpiceSensation;
import java.util.Scanner;

public class UserInterface {
    public static Spice extractDetails(String spiceDetails){

        String info[] = spiceDetails.split(":");
        Spice obj = new Spice(info[0],info[1],Integer.parseInt(info[2]),info[3],Integer.parseInt(info[4]));
        return obj;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String spiceDetails = s.nextLine();
        Spice obj = new Spice();
        obj = extractDetails(spiceDetails);
        String str = obj.findSpiceLevel();
        if(str.equals(str)){
            System.out.println("Invalid spice details");
        }else{
            System.out.println("Spice Name: "+obj.getSpiceName());
            System.out.println("Origin: "+obj.getOrigin());
            System.out.println("Spice Rating: "+obj.getSpiceRating());
            System.out.println("Spice Color: "+obj.getColor());
            System.out.println("Spice Shelf Life: "+obj.getShelfLifeInMonths());
            System.out.println("Spice Level: "+obj.findSpiceLevel());
        }
        s.close();
    }
}
