import java.util.Scanner;

public class Main{
    public static LaptopInfo extractDetails(String laptopDetails){
        String info[] = laptopDetails.split(":");
        LaptopInfo obj = new LaptopInfo(info[0],info[1],info[2],Double.parseDouble(info[3]));
        return obj;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the laptop details");
        String laptopDetails = s.nextLine();
        LaptopInfo obj = new LaptopInfo();
        obj = extractDetails(laptopDetails);
        if(obj.calculateLaptopCost() == -1){
            System.out.println("Invalid details");
        }else{
            System.out.println("Laptop Id:"+obj.getLaptopId());
            System.out.println("Model Name:"+obj.getModelName());
            System.out.println("Brand Name:"+obj.getBrandName());
            System.out.println("Laptop Cost:"+obj.calculateLaptopCost());
        }
        s.close();
    }
}