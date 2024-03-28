import java.util.*;

Object


class bill{
    private int price;
    private int disccount;
    @Override
    public String toString() {
        return "bill [price=" + price + ", disccount=" + disccount + "]";
    }
    

}

public class DT1 {
    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        // Date d = new Date("06/12/2024");
        // System.out.println(d.getMonth()+1);

        GregorianCalendar obj = new GregorianCalendar();
        System.out.println(obj.isLeapYear(2024));
        System.out.println(obj.get(Calendar.DAY_OF_YEAR));

        TimeZone o = obj.getTimeZone();
        System.out.println(o.getID());
        System.out.println(o.getOffset(1/29/2024));
        System.out.println(o.getDisplayName());
    }   
}
