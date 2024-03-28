import  java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.*;
import java.time.temporal.*;


public class DT2 {
    public static void main(String[] args) {
        //LocalDate dt = new LocalDate(); 
        /*We cannot create new date in localtime we just use it it make it inmuttable */
        // LocalDate dt = LocalDate.now();
        // LocalDate dt1 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        // LocalDate dt2 = LocalDate.of(2024, Month.FEBRUARY, 10);
        // LocalDate dt3 = LocalDate.parse("2024-01-03");
        // LocalDate dt4 = dt3.plusMonths(7);
        LocalDateTime d = LocalDateTime.of(2019, 0, 0, 0, 0);
        LocalDateTime d1 = d.p
        System.out.println(d1);
        

        // System.out.println(dt);
        // System.out.println(dt1);
        // System.out.println(dt2);
        // System.out.println(dt3);
        // System.out.println(dt4);

        // LocalTime lt = LocalTime.now();
        // System.out.println(lt);

        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // System.out.println(df.format(dt));
    }
}
