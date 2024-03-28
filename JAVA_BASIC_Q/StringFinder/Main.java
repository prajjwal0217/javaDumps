package StringFinder;
import java.util.Scanner;

public class Main {

    public static int stringFinder(String str,String str1,String str2){
        
        String n[] = str.split(str1);
        if(n.length == 1 ){
            return 0;
        }else if(n[1].contains(str2)){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String str1 = s.next();
        String str2 = s.next();

        if(stringFinder(str,str1,str2) == 1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        s.close();
    }
}
