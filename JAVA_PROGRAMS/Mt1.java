class MyRunnable implements Runnable
{
    public void run(){
        int i =0;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class Mt1{

   
        public static void main(String[] args) 
        {
            MyRunnable obj = new MyRunnable();
            Thread obj1 =new Thread(obj);
            obj1.start();
            int i =0;
            while(true){
            System.out.println(i+" World");
            i++;
        }

        }
} 
