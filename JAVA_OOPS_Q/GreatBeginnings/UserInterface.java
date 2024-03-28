package GreatBeginnings;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class UserInterface {
    public static Event extractDetails(String eventDetails) throws ParseException{
        String info[] = eventDetails.split(":");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
        Date dor = df.parse(info[2]);
        Date doe = df.parse(info[3]);
        if(dor.compareTo(doe) <=0){
            Event obj = new Event(info[0],info[1],dor,doe,Double.parseDouble(info[4]));
            return obj;
        }else{
            return null;
        }
    }
    public static void main(String[] args) throws ParseException{
        Scanner s = new Scanner(System.in);
        String eventDetails = s.next();
        Event obj = new Event();
        obj = extractDetails(eventDetails);
        SimpleDateFormat df =  new SimpleDateFormat("dd-MM-yyyy");
        if(obj == null){
            System.out.println("Date of registration can not be before date of event");
        }else{
            
                if(obj.calculateAmountTobePaid() == -1){
                    System.out.println("Invalid details");
                }else{
                    String dor = df.format(obj.getDateOfRegistration());
                    String doe = df.format(obj.getDateOfEvent());
                    System.out.println("Event Id:"+obj.getEventId());
                    System.out.println("Event Name:"+obj.getEventName());
                    System.out.println("Date Of Registration:"+dor);
                    System.out.println("Date Of Event:"+doe);
                    System.out.println("Payment:"+obj.getPayment());
                    System.out.println("Amount to be paid by the customer:"+obj.calculateAmountTobePaid());
                }
            }
        s.close();
    }
}
