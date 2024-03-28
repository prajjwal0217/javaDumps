package LengthOfSameWord;
import java.util.Scanner;

public class Main {
    
    public static int compareLastWords(String str){
        String arr[] = str.split(" ");
        
        String fword = arr[0];
        String lword = arr[arr.length-1];
        if(fword.equalsIgnoreCase(lword)){
            return fword.length();
        }else{
            return fword.length()+lword.length();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(compareLastWords(str));
        sc.close();
    }
}
