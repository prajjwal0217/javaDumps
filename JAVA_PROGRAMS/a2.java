public class a2 {
    public static void main(String[] args) {
        int  a[] ={3,9,7,8,12,6,15,5,4,10};
        int sum = 0;

        /*Sum of array element */
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        System.out.println(sum);

        /*Searching of an element in array 6*/
        for(int i:a){
        if(i == 20) {
            System.out.println("found the element ");
            System.exit(0);
          }
        }
        System.out.println("Not found");

        /*Maximum element of an array*/
        int max_element = a[0];
       
        for(int i=0;i<a.length;i++){
            if(max_element <a[i]){
                max_element = a[i];
            }
        }
        System.out.println(max_element);

        /*Second max element in array */
        int max1 = a[0];
        int max2 = a[0];

        for(int i =0;i<a.length;i++){

            if(a[i]>max1){
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i]>max2){
                max2 = a[i];
            }
        }
        System.out.println(max2);

        /*Reversing an array */

        int b[] = new int[a.length];
       int len = a.length-1;
       System.out.println(len);
        for(int i = len;i>=0;i--){
            
            b[len-i] = a[i];
        }
        for(int i:b){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        for(int i:a){
            System.out.print(i+" ");
        }
       
    }
}
