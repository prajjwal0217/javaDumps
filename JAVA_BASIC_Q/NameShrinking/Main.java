package NameShrinking;
import java.util.Scanner;

public class Main {
    
    public static String getFormatedString(String input){
        
        String arr[] = input.split(" ");
        String result ="";
        for(int i =2;i>=0;i--){
            if(i == 2){
                result += arr[2]+" ";
            }
            if( i == 1){
                result += arr[1].charAt(0)+".";
            }
            if( i ==0){
                result +=arr[0].charAt(0);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(getFormatedString(input));
        s.close();
    }
}
