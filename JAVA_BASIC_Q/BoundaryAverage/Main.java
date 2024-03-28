package BoundaryAverage;
import java.io.*;

public class Main {

    public static float getBoundaryAverage(int[] element){
        int max = Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;

        for(int i=0;i<element.length;i++){
            if(max < element[i]){
                max = element[i];
            }
        }
        
        for(int i=0;i<element.length;i++){
            if(min >element[i]){
                min = element[i];
            }
        }
        
        
        float result = (float)(max+min)/2;

        return result;
    }
    public static void main(String arg[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        int[] inputs = new int[n];
        for(int i =0;i<n;i++){
            inputs[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(getBoundaryAverage(inputs));
    }
}
