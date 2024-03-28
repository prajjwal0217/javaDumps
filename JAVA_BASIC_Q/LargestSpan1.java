import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class LargestSpan1 {

    public static int getLargestSpan(int arr[]){
        HashMap<Integer,Integer> h = new HashMap<>();
        int maxSpan =0;
        for(Map.Entry<Integer,Integer> e: h.entrySet());
        for(int i=0;i<arr.length;i++){
            if(!h.containsKey(arr[i])){
                h.put(arr[i],i);
            }else{
                int span = i- h.get(arr[i]) +1;
                if(span > maxSpan){
                    maxSpan = span;
                }
            }
        }
        List<Integer> il = new ArrayList<>();
        il.contains(il);

        return maxSpan;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int[] arr=new int[n1];
		for(int i=0;i<n1;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(getLargestSpan(arr));
        sc.close();
    }
}

