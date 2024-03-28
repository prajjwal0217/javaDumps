package ArrayListOnSetOperation;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main{
    public static ArrayList<Integer> performSetOperation(ArrayList<Integer> al1,ArrayList<Integer> al2,char c){
        ArrayList<Integer> res = new ArrayList<>();
        TreeSet<Integer> t = new TreeSet<>();
        switch(c){
            case '+': 
                        t.addAll(al1);
                        t.addAll(al2);
                        res.addAll(t);
                        break;
            case '*': 
                        for(Integer i: al1){
                            for(Integer j: al2){
                                if(i == j){
                                    res.add(i);
                                }
                            }
                        }
                        break;
            case '-':
                        for(int i =0;i<al1.size();i++){
                            for(int j =0;i<al2.size();j++){
                                if(al1.get(i) == al2.get(j)){
                                    al1.remove(i);
                                }
                            }
                        }
                        res.addAll(al1);
                        break;            
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0;i<n;i++){
            al1.add(s.nextInt());
        }
        for(int i =0;i<n;i++){
            al2.add(s.nextInt());
        }
        char c = s.next().charAt(0);
        res = performSetOperation(al1, al2, c);
        for(Integer i: res){
            System.out.println(i);
        }
        s.close();
    }
}