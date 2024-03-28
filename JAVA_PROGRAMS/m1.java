public class m1 {
    
    int max(int a ,int b){ // copyed parameters of acutal one pass by value
        if(a>b) return a;
        else return b;
    }
    // a and b are formal parameter
    // this function a and b will get destroyed once the function call is complete in the stack memory
    public static void main(String[] args) {
        int a =20;
        int b = 15;

        m1 obj = new m1();  // calling a instance menthod 
        // m1.max(); make the function static
        
        System.out.println(obj.max(a,b)); // a and b are actual parameters or arguments
    }
}
