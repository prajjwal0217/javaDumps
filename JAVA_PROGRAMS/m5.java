public class m5 {
   
    static double  area(double l,double b){
        return l*b;
    }

    static double area(double r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        System.out.println(area(4.5,5.6));
        System.out.println(area(5.5));
    }
}
