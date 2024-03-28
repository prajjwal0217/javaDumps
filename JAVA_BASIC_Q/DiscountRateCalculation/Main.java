package DiscountRateCalculation;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {

    public static ArrayList<String> calculateDiscount(HashMap<String,String> hm1,HashMap<String,Integer> hm2){
        
        ArrayList<String> al = new ArrayList<>();
       
        for(Map.Entry<String,String> e:hm1.entrySet()){

            for(Map.Entry<String,Integer> e1 : hm2.entrySet()){
                
                if(e.getKey().equals(e1.getKey())){
                    Integer year = Integer.parseInt(e.getValue().split("-")[2]);
                    Integer month = Integer.parseInt(e.getValue().split("-")[1]);
                    Integer days = Integer.parseInt(e.getValue().split("-")[0]);
                    
                    // LocalDate date1 = LocalDate.of(year,month,days);
                    LocalDate date1 = LocalDate.of(year,month,days);
                
                    LocalDate date2 = LocalDate.of(2015,01,01);
                    long diff = ChronoUnit.YEARS.between(date1, date2);
                    System.out.println(diff);
                    if(e1.getValue() >=20000){
                        if(diff >=5){
                            al.add(e.getKey()+":"+(int)(e1.getValue()*0.2));
                        }else{
                            al.add(e.getKey()+":"+(int)(e1.getValue()*0.1));
                        }
                    }else{
                        if(diff >=5){
                            al.add(e.getKey()+":"+(int)(e1.getValue()*0.15));
                        }else{
                            al.add(e.getKey()+":"+(int)(e1.getValue()*0.05));
                        }
                    }
                }else{
                    continue;
                }
            }
        }
        
        return al;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> dor = new LinkedHashMap<>();
        HashMap<String,Integer> amt = new LinkedHashMap<>();
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            String id = sc.next();
            dor.put(id,sc.next());
            amt.put(id,sc.nextInt());
        }

        ArrayList<String> res = calculateDiscount(dor,amt);
        for(String x:res){
            System.out.println(x);
        }

        sc.close();
    }
}
