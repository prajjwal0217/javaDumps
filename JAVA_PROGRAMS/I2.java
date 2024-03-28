class Parent{

    Parent(){
        System.out.println("Parent constructor");
    }
}

class Child extends Parent{

    Child(){
        super(); // by default compiler will create the super constructor to call parent class
        System.out.println("Child constructor");
    }
}


public class I2 {
    public static void main(String[] args) {
        Child obj = new Child(); // First parent constructor is called then child constructor

    }
    
}
