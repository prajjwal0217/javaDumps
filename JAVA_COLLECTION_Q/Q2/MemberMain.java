package Q2;
import java.util.*;

public class MemberMain {
    private Map<String,String> memberMap = new HashMap<>();

    public Map<String, String> getMemberMap() {
        return memberMap;
    }

    public void setMemberMap(Map<String, String> memberMap) {
        this.memberMap = memberMap;
    }

    public String findMemberTypeOfGivenMemberId(String memberId){
        
        for(Map.Entry<String,String> e: memberMap.entrySet()){
            if(e.getKey().equals(memberId)){
                return e.getValue();
            }
        }
        return "Invalid member id";
    }

    public List<String> findMemberIdsBasedOnTheMemberType(String memberType){
        
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,String> e: memberMap.entrySet()){
            if(e.getValue().equalsIgnoreCase(memberType)){
                list.add(e.getKey());
            }
        }
        return list;
    } 
    
    public static void main(String[] args) {
        
    }
}
