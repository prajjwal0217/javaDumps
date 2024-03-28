package Remove3Multiple;
import  java.util.ArrayList;
import  java.util.Scanner;

public class Main {

    public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> al){
        
        ArrayList<Integer> nal = new ArrayList<>();
        for(int i=0;i<al.size();i++){
            if((i+1)%3 != 0){
                nal.add(al.get(i));
            }
        }
        return nal;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        
        int len = s.nextInt();
        for(int i=0;i<len;i++){
            al.add(s.nextInt());
        }
        al = removeMultiplesOfThree(al);
        System.out.println("=============");
        for(int a:al){
            System.out.println(a);
        }
        s.close();


    }
}
