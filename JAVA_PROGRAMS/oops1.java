import java.util.HashMap;
import java.util.Map;

class Circle{

    public double radius; // Propertie of Circle class

    public double area(){
        return Math.PI*radius*radius;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }

    public double perimeter(){
        return circumference();
    }
}

class Rectangle {
    double length;
    double breadth;

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }
}

class Cylinder{

    public double height;
    public double radius;

    public double lidArea(){
        return Math.PI*radius*radius;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double totalSurfaceArea(){
    return 2*lidArea()+circumference()*height;
    }
    public double volume(){
        return lidArea()*height;
    }


}
public class oops1 {
    public static void main(String[] args) {
     
        Circle obj = new Circle();
        Rectangle obj1 = new Rectangle();

        obj.radius =7;

        System.out.println("Area of circle is: "+obj.area());
        System.out.println("Perimeter of circle is: "+obj.perimeter());
        System.out.println("Circumference of circle is:"+obj.circumference());
        
        System.out.println("Area of rectangle is:"+obj1.area());
        System.out.println("Perimeter of rectangle is:"+obj1.perimeter());

       
    }
    
}
