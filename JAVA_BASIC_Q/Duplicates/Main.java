package Duplicates;
import java.io.*;

public class Main {

    public static int getDistinctSum(int num1,int num2,int num3){
        if(num1 == num2){
            return num3;
        }else if(num1 == num3){
            return num2;
        }else{
            return num1+num2+num3;
        }
    }
    public static void main(String[] args) throws IOException {
        int input1,input2,input3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input1 = Integer.parseInt(br.readLine());
        input2 = Integer.parseInt(br.readLine());
        input3 = Integer.parseInt(br.readLine());
        System.out.println(getDistinctSum(input1,input2,input3));

    }
}
