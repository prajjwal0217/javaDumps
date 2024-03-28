import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x =n;
        List<Integer> l = new ArrayList<>();
        TreeSet<Integer> unquieNumber = new TreeSet<>();
        while(x != 0){
            int d1 = x%10;
            l.add(d1);
            x=x/10;
        }
        for(Integer i: l){
           unquieNumber.add(i);
        }

        if(l.size() == unquieNumber.size()){
            System.out.println("Unique");
        }else{
            System.out.println("Not Unique");
        }
    }
}
