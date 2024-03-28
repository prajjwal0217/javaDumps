package Retirement;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main{

    public static ArrayList<String> retirementEmployeeList(LinkedHashMap<String,String> hm) throws ParseException{

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<String> al =new ArrayList<>();
        Date dob = new Date();
       
        for(Map.Entry<String,String> e: hm.entrySet()){
            dob = df.parse(e.getValue());
            Calendar c = Calendar.getInstance();
            c.setTime(dob);
            int yeardob = c.get(Calendar.YEAR);
            int monthdob = c.get(Calendar.MONTH);
            int daydob = c.get(Calendar.DAY_OF_MONTH);
            int y = Math.abs(yeardob - 2015);
            if(monthdob == 01){
                if(daydob > 01){
                    y--;
                }
            }else if(monthdob > 01){
                y--;
            }
            if(y>= 60){
                al.add(e.getKey());
            }
        }

        return al;
    }
    public static void main(String[] args) throws ParseException{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
        
        for (int i = 0; i < n; i++){
            hm.put(s.next(), s.next());
           
        }
        System.out.println(retirementEmployeeList(hm));
        s.close();
    }
}
// 4
// C1010
// 02/11/1987
// C2020
// 15/02/1980
// C3030
// 14/12/1952
// T4040
// 20/02/1950