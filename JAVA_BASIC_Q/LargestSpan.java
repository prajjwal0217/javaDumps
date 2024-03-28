import java.util.Scanner;

public class LargestSpan {

    public static int getLargestSpan(int arr[]){
        int gap=0;
        int max=0;
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   gap=j;
               }
           }
           if(gap-i>max){
               max=gap-i;
           }
       }
       return max+1;
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
