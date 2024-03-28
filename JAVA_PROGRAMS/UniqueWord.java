import java.util.* ;

public class UniqueWord{
 
    public static void main(String[] arg){
 
        Scanner s = new Scanner(System.in) ;
 
        System.out.println("Enter Student's Article") ;
        String a = s.nextLine() ;
        String b1 = a.replaceAll("\\s+"," ");
        System.out.println(b1);
        String b2 = b1.toLowerCase();
        String b3 = b2.replaceAll("[^a-z]"," ");
        System.out.println(b3);
        String b4 = b3.replaceAll("  "," ");
        System.out.println(b4);
        // System.out.println(b4) ;
        String b[] = b4.split(" ");
       
        int x =1;
 
        // for(String m : b){
        //     System.out.println(x+". "+m);
        //     x++;
        // }
 
        Set<String> a1 = new TreeSet<>() ;
 
        for(int i =0 ; i < b.length ; i++ ){
            a1.add(b[i]) ;
        }
 
        System.out.println("Number of words "+b.length) ;
 
        System.out.println("Number of unique words "+a1.size()) ;
 
        System.out.println("The words are") ;
 
 
 
        Iterator<String> i2 = a1.iterator()  ;
                                               
        while(i2.hasNext()) {
            System.out.println(x+". "+i2.next());  
            x++ ;
        }  
 
 
    }
}
