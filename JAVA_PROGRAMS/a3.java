public class a3 {
    public static void main(String[] args) {
        int a[] = {5,8,3,4,9,12,7,15,1,4};

        // int temp = a[0];

        // for(int i = 0;i<a.length;i++){
        //     a[i] =a[i+1];
        // }

        // a[a.length-1] = temp;

        // for(int i:a){
        //     System.out.print(i+" ");
        // }

        /*Right rotation of an array */

        int temp1 = a[a.length-1];

        for(int i=a.length-1;i>0;i--){
         a[i] = a[i-1];
        }
        a[0] = temp1;
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}

