public class Eh3 {
    static int area(int lenght, int breadth) throws Exception
    {
        if(lenght<0 || breadth <0) throw new Exception();
        return lenght*breadth;
    }
    static void area1() throws Exception
    {

        System.out.println("Area is "+area(-10,5));
    }
    public static void main(String[] args) {
        try{
            area1();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
