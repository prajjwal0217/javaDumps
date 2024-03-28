public class m6 {
    
    static int reverse(int a){
        
        int rev=0;
        while(a > 0){
            int b;
            b = a%10;
            rev = rev*10+b;
            a = a/10;
        }
        return rev;
    }
    public static void main(String[] args) {

      System.out.println(reverse(12345));
    }
    
}
