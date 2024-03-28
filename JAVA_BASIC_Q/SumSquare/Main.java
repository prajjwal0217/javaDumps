import java.util.*;

public class Main {
    public static int getSumSquareOfDigits(int number){
        int x = number;
        int sum =0;

        while(x !=0){
            int  n1 = x%10;
            sum += n1*n1;
            x =x/10; 
        }

        return sum;
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(getSumSquareOfDigits(number));
        s.close();
    }
}
