
class Data <T>{
    private T obj;

    public void setObj(T obj){
        this.obj = obj;
    }
    public T getObj(){
        return this.obj;
    }

}

public class gen {
    public static void main(String[] args) {
        Data<Integer> d= new Data<>();
        d.setObj(new Integer(10));

        System.out.println(d.getObj());
    }
}
