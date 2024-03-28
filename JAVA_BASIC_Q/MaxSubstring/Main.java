package MaxSubstring;
import java.util.*;

public class Main {
    
    public static String extractMax(String str1,String str2){
        char c = str2.charAt(0);
        char arr[] = new char[str1.length()];
        
        for(int i=0;i<str1.length();i++){
            arr[i] = str1.charAt(i);
        }
        String str3 = "";
        for(int i=0;i<str1.length();i++){
            if(arr[i] == c){
                str3 +=" "; 
                continue;
            }
            str3 += arr[i];
        }
        String str4[] = str3.split(" ");
        int maxLength = Integer.MIN_VALUE;
        for(int i=0;i<str4.length;i++){
            if(maxLength < str4[i].length()){
                maxLength = str4[i].length();
            }
        }
        for(int i=0;i<str4.length;i++){
            if(maxLength == str4[i].length()){
                return str4[i];
            }
        }
        
        return null;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        System.out.println(extractMax(str1,str2));
    }
}
