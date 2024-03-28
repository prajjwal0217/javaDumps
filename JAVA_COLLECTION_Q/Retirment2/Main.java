package Retirment2;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;


public class Main{

    public static ArrayList<String> retirementEmployeeList(LinkedHashMap<String,String> hm){

        LocalDate doc = LocalDate.of(2015, 01, 01);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        doc.format(df);

        ArrayList<String> al =new ArrayList<>();
       
       
        for(Map.Entry<String,String> e: hm.entrySet()){
            String str = e.getValue();
            LocalDate dob = LocalDate.of(Integer.parseInt(str.split("/")[2]),Integer.parseInt(str.split("/")[1]),Integer.parseInt(str.split("/")[0]));
            dob.format(df);
            long age = ChronoUnit.YEARS.between(dob, doc);
            
            if(age>= 60){
                al.add(e.getKey());
            }
        }

        return al;
    }
    public static void main(String[] args){
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
