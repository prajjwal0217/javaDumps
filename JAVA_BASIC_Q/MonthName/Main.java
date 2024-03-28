package MonthName;
import java.text.*;
import java.util.Scanner;

public class Main {

    public  static String getMonthName(String str){
        
        String month = str.split("-")[1];
        switch(month){
            case "01": return "JANUARY";
            case "02": return "FEBRUARY";
            case "03": return "MARCH";
            case "04": return "APRIL";
            case "05": return "MAY";
            case "06": return "JUNE";
            case "07": return "JULY";
            case "08": return "AUGUST";
            case "09": return "SEPTEMBER";
            case "10": return "OCTOBER";
            case "11": return "NOVEMBER";
            case "12": return "DECEMBER";
        }

        return null;
    }
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getMonthName(str));
        sc.close();
    }    
}
