public class a5 {
    public static void main(String[] args) {
        // int a[][] = new int[5][5];

        int b[][] = {{1,2,3},{3,5,4},{4,4,3}};

        // int[] e,f[]; // e is 1-D array where as f  is 2-D array

        // int []d[]; //valid

        for(int i=0;i<b.length;i++){

            for(int j=0;j<b[0].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        for(int x[]:b){
            for(int x1:x){
                System.out.print(x1+" ");
            }
            System.out.println();
        }
    
    
    }
}
