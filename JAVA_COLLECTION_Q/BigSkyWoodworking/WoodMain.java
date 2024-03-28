package BigSkyWoodworking;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class WoodMain {
    private Map<String,String> woodMap = new HashMap<>();

    public Map<String, String> getWoodMap() {
        return woodMap;
    }

    public void setWoodMap(Map<String, String> woodMap) {
        this.woodMap = woodMap;
    }

    public int findCountOfOrderIdsBasedOnTheWoodType(String woodType){
        
        int count =0;
        for(String s: woodMap.values()){
            if(s.equalsIgnoreCase(woodType)){
                count++;
            }
        }
        if(count == 0){
            return -1;
        }
        return count;
    }

    List<String> findOrderIdsBasedOnTheWoodType(String woodType){
        List<String> al = new ArrayList<>();
        for(Map.Entry<String,String> e: woodMap.entrySet()){
            if(e.getValue().equalsIgnoreCase(woodType)){
                al.add(e.getKey());
            }
        }
        return al;
    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        WoodMain obj = new WoodMain();
        map.put("HGSU1762","Sandal");
        map.put("HGSU1763","Maple");
        map.put("HGSU1764","Cherry");
        map.put("HGSU1765","RedSandal");
        obj.setWoodMap(map);
        System.out.println(obj.findCountOfOrderIdsBasedOnTheWoodType("maple"));
        List<String> l = new ArrayList<>();
        l = obj.findOrderIdsBasedOnTheWoodType("Maple");
        for(String s : l){
            System.out.println(s);
        }

    }
}
