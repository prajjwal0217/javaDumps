
@FunctionalInterface
interface Mylambda{
    int add(int x,int y);
    
}

/*class My implements Mylambda
{
    public void show(){
        System.out.println("hello world");
    }
}
*/

public class Le1 
{
    public static void main(String[] args) {
        
      Mylambda obj = (x,y)->x+y;
     
      System.out.println(obj.add(28, 12));
      
    }
    
}
