package FileExtension;
import java.util.Scanner;

public class Main {

    public static String fileIdentifier(String str){
        
        String arr[] = str.split("\\.");
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String output = fileIdentifier(str);
        System.out.println(output);
        sc.close();
    }
}
