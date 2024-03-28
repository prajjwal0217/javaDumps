import java.util.*;

public class Cf1 {
    public static void main(String[] args) 
    {
        int n = 0;
        
        // ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        ArrayList<Integer> al1 = new ArrayList<>(n);
        
        for(int i =0;i<n;i++){
            int c = s.nextInt();
            al1.add(c);
        }
        s.close();
        // al1.add(10);
        // al1.add(20);
        // al1.add(30);
        // al1.add(40);
        // al1.add(0,5);
        // al1.addAll(1,al2);

        // System.out.println(al1.set(3,65));

        // System.out.println(al1);
        // System.out.println();
        // System.out.println(al2);

        // Iterator<Integer> i = al1.iterator();

        // while(i.hasNext()){
        //     System.out.print(i.next()+" ");
        // }
        for(Integer i1:al1){
            System.out.println(i1);
        }

    }
}
