public class a1 {
    public static void main(String[] args) {
        
        /*Initialization of  array*/
        int[] a ={1,2,3,4,5};
        
        int b[] = new int[5];

        int c[];
        c = new int[10];

        c[3] = 10;
        
        /*To set the value of array */
        /*Can not use for each loop */
      for(int i=0;i<b.length;i++){
        b[i] = i*2;
      }
      
      /*Copying an array to increase the size */
      for(int i=0;i<b.length;i++){
        c[i] = b[i];
      }

      /*Printing of an array using for each loop */
      for(int i:c){
        System.out.println(i);
      }



    }
}
