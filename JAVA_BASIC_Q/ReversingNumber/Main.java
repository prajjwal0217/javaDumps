package ReversingNumber;
import java.util.Scanner;

public class Main {
    
    public static int reverseNumber(int number){
        
        int rNumber = 0;
        int x =number;
        
        while(x != 0){
            int d1 = x%10;
            rNumber = rNumber*10+d1;
            x = x/10;
        }
       return rNumber;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(reverseNumber(number));
        s.close();
    }
}
