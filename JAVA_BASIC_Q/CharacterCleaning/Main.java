package CharacterCleaning;
import java.util.*;

public class Main {

    public static String removeCharacter(String str,char c){
        String resultStr ="";
        char[] a = new char[str.length()];
        for(int i=0;i<str.length();i++){    
           a[i] = str.charAt(i); 
        }
        for(int i=0;i<a.length;i++){
            if(a[i] != c){
                resultStr += a[i];
            }
        }
        return resultStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        char c =sc.next().charAt(0);
        System.out.println(removeCharacter(inputString,c));
        sc.close();

    }
}
