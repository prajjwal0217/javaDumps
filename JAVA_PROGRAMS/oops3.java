
class Cylinder{

    private double radius;
    private double height;

    public Cylinder(){
        radius =1;
        height =1;
    }
    
    public Cylinder(double radius){
        this.radius = radius;
        height =1;
    }

    public Cylinder(double radius,double height){
        this.radius = radius;
        this.height = height;
    }

    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setDimensions(double radius,double height){
        this.radius = radius;
        this.height = height;
    }
}


public class oops3 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(12,2);
        double height =obj.getHeight();
        System.out.println(height);
    }
    
}
