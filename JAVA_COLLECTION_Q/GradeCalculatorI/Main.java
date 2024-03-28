package GradeCalculatorI;
import GradeCalculatorI.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        LinkedHashMap<String,Float> map = new LinkedHashMap<>();
        HashMap<String,String> map1 = new HashMap<>();

        for(int i=0;i<n;i++){
            String key = s.next();
            float value = s.nextFloat();
            map.put(key,value);
        }

        map1 = GradeCalculatorI.UserMainCode.calculateGrade(map);

        for(Map.Entry<String,String> obj: map1.entrySet()){
            System.out.println(obj.getKey());
            System.out.println(obj.getValue());
        }

        s.close();
    }
}
