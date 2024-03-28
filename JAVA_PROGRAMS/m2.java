public class m2 {
    
    /*Pass my reference */

    static void change(int a[],int index,int value){
        a[index] = value;
    }
    public static void main(String[] args) {
        
        int a[] ={3,5,6,8,6,1,2,9};

        change(a,4,7);

        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
