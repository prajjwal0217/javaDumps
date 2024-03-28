package GradeCalculatorI;
import java.util.*;

public class UserMainCode {
    public static HashMap<String,String> calculateGrade(HashMap<String,Float> hm){
        
        HashMap<String,Float> info = new HashMap<>();
        info =hm;
        HashMap<String,String> result = new HashMap<>();
        for(Map.Entry<String,Float> e: info.entrySet()){
            if(e.getValue() < 60){
                result.put(e.getKey(),"FAIL");
            }else{
                result.put(e.getKey(),"PASS");
            }
        }

        return result;
    }
}
