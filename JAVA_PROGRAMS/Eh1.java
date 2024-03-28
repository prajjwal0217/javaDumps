import java.util.Scanner;

public class Eh1{
    public static void main(String[] args) {
        System.out.println("Input the two numbers");
        Scanner s =new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        try{   
            int c = a/b;
            System.out.println(c);
            
        }
        catch(Exception e){
            System.out.println("Invaild input: "+e);
        }
        System.out.println("Thank you for using my program");
        s.close();
    }
}
    

