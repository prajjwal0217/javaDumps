package FantasyCreature;
import java.util.*;

public class FantasyCreature {
    private Map<String,Integer> fantasyCreatureMap = new HashMap<>();

    public Map<String, Integer> getFantasyCreatureMap() {
        return fantasyCreatureMap;
    }

    public void setFantasyCreatureMap(Map<String, Integer> fantasyCreatureMap) {
        this.fantasyCreatureMap = fantasyCreatureMap;
    }

    public int findTheHitPointsForTheGivenCreature(String creature){
        
        
        for(Map.Entry<String,Integer> e: fantasyCreatureMap.entrySet()){
            if(e.getKey().equals(creature)){
                return e.getValue();
            }
        }
        return -1;
    }

    public List<String> findTheCreatureNamesBasedOnTheHitpoints(){
        
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> e: fantasyCreatureMap.entrySet()){
            if(e.getValue() >= 80){
                list.add(e.getKey());
            }
        }
        return list;
    }
    public static void main(String arg[]){
        
    }    
}
