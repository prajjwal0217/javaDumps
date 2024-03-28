package Scores;
import java.util.*;

public class Main{

    public static boolean checkScores(int[] a){
        int size = a.length;
        if(size == 1){
            return false;
        }

        for(int i =0;i<size;i++){
            if(a[i] == 100){
                if( (i != (size-1)) && (a[i+1]== 100)){
                    return true;
                }else{
                    return false;
                }
            }else{
                continue;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner s =new Scanner(System.in);

        int count = s.nextInt();
        int[] a = new int[count];

        for(int i =0;i<count;i++){
            a[i] = s.nextInt();
        }

        if(checkScores(a)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
        s.close();
    }
}