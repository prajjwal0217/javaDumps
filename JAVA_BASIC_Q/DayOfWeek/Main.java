package DayOfWeek;
import java.util.*;
import java.io.*;
import java.time.*;

public class Main {

    public static String getDayOfWeek(String date){
        
        LocalDate ld = LocalDate.of(Integer.parseInt(date.split("/")[2]),Integer.parseInt(date.split("/")[1]),Integer.parseInt(date.split("/")[0]));
        DayOfWeek dw = (ld.getDayOfWeek());
        System.out.println(Year.isLeap(Long.parseLong(date.split("/")[2])));
        return dw.toString().toLowerCase();
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String date = br.readLine();
            String result = getDayOfWeek(date);
            System.out.println(result);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
