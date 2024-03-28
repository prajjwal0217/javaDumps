import java.util.*;

public class m3
{
   
   static boolean isPrime(int a)
   {
    for(int i =2;i>a/2;i++)
    {
            
        if(a%i==0) return false;
        
    }
    return true;
   }
   
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Input the number here: ");
        int n = s.nextInt();
    

        System.out.println("The number is a prime number "+isPrime(n));
    }
}
