class MyData{
    int value;
    boolean flag = true;
    synchronized public void set(int value){
        while(flag != true)
            try{wait();} catch(Exception e){}
        this.value = value;
        flag = false;
        notify();

    }
    synchronized public int get(){
        int x =0;
        while(flag != false)
            try{wait();} catch(Exception e){}
        x = value;
        flag = true;
        notify();
        return x;
    }
}
class Producer extends Thread{
    MyData data;

    public Producer(MyData data){
        this.data =  data;
    }
    public void run(){
        int count =1;
        while(true){
            data.set(count);
            System.out.println("Producer: "+count);
            count++;
        }
    }

}
class Consumer extends Thread{
    MyData data;

    public Consumer(MyData data)
    {
        this.data =  data;
    }
    public void run(){
        
        while(true){
            int value = data.get();
            System.out.println("Consumer: "+value);
        }
    }

}
public class Mt2 {
    public static void main(String[] args) 
    {
        MyData data = new MyData();

        Producer p =  new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();
    }
    
}
