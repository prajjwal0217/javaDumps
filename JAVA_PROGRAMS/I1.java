
class Circle {

    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double circumference(){
        return perimeter();
    }
}

class Cylinder extends Circle{
    public double height;

    public double volume(){
        return area()*height;
    }
}


public class I1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.radius = 5;
        c1.height = 10;
        
        System.out.println("Area of lid: "+c1.area());
        System.out.println("Volume : "+c1.volume());
    }
    
}
