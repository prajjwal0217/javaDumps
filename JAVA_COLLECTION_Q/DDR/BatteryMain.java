
import java.util.*;

public class BatteryMain {
   private Map<String,Integer> batteryMap = new HashMap<>();

    public Map<String, Integer> getBatteryMap() {
    return batteryMap;
    }

    public void setBatteryMap(Map<String, Integer> batteryMap) {
    this.batteryMap = batteryMap;
    }

    public int findWattPowerBasedOnBatteryName(String batteryName){
        
        for(Map.Entry<String,Integer> e: batteryMap.entrySet()){
            if(e.getKey().equalsIgnoreCase(batteryName)){
                return e.getValue();
            }
        }
        return -1;
    }

    public List<String> findHighestWattBatteries(){
        
        List<String> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(Integer i: batteryMap.values()){
            if(i > max){
                max = i;
            }
        }
        for(Map.Entry<String,Integer> e: batteryMap.entrySet()){
            if(e.getValue() == max){
                list.add(e.getKey());
            }
        }
        return list;
    }
    
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        BatteryMain obj = new BatteryMain();
        map.put("Hero Cell",30);
        map.put("Bull Cell",40);
        map.put("Ivp Cell",70);
        map.put("Tvp Cell",70);
        map.put("Netron Cell",70);
        obj.setBatteryMap(map);
        System.out.println(obj.findWattPowerBasedOnBatteryName("Hero Cell"));
        List<String> list = new ArrayList<>();
        list = obj.findHighestWattBatteries();
        for(String s: list){
            System.out.println(s);
        }
    }
}
