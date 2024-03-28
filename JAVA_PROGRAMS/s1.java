
class hello{
    static int x =10;
    int y =20;

    /*Non-Static method can access the static member */
    void show(){
        System.out.println(x+" "+y); 
    }
    static void display(){
        /*Static method can not access non static member of the class */
        // System.out.println(x+"+"+y);
        System.out.println(x);
    }
}

public class s1 {
    public static void main(String[] args) {
        hello h1 = new hello();
        h1.show();
        h1.x = 100;
        h1.y =200;

        hello h2 = new hello();
        h2.show();


    }    
}
