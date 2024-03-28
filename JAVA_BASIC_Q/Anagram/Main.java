package Anagram;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main{
    public static boolean isAnagram(String str1,String str2){
        boolean b = false;
        ArrayList<Character> al1 = new ArrayList<>();
        ArrayList<Character> al2 = new ArrayList<>();

        for(int i=0;i<str1.length();i++){
            char c = str1.charAt(i);
            al1.add(c);
        }
        for(int i=0;i<str2.length();i++){
            char c = str2.charAt(i);
            al1.add(c);
        }
        Collections.sort(al1);
        Collections.sort(al2);
        if(al1.containsAll(al2)){
            return true;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        System.out.println(isAnagram(str1, str2));
        s.close();
        StringBuffer sb = new StringBuffer();
        sb.reverse()
        Date obj = new Date();
        
    }
}