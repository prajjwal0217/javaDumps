class Parent{

    Parent(){
        System.out.println("Non para constructor");
    }

    Parent(int x){
        System.out.println(" Parent Para constructor");
    }
}

class Child extends Parent{

    Child(){
        System.out.println("Non para constructor");
    }

    Child(int x ,int y){
        super(x);
        System.out.println("child para constructor "+(x+y));
    }
}


public class I3 {
    public static void main(String[] args) {
        Child obj = new Child(3,4);
    }
    
}
