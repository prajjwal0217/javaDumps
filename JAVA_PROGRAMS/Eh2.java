import java.lang.ref.Cleaner;

public class Eh2 {

    static int meth(){
        return 10/0;
    }
    static void meth1(){
        meth();
    }
    static void  meth2(){
        meth1();
    }
    public static void main(String[] args) {
        meth2();
    }
}
