
class NegativeDimensionException extends Exception{

    public String toString(){
        return "The dimensions of rectangle can not be negative";
    }
}


public class Eh4 {
    static int area(int lenght,int breadth) throws NegativeDimensionException
    {
        if(lenght<=0 || breadth<=0) throw new NegativeDimensionException();
        return lenght*breadth;
    }  
    static void area1() throws NegativeDimensionException
    {
        System.out.println("The area is "+area(-10, 34));
    }
    public static void main(String[] args)
     {
        try{
            area1();
        }
        catch(NegativeDimensionException e){
            System.out.println(e);
        }
        
    }
}
