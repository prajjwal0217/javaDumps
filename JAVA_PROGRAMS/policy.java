import java.util.*;


public class policy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Bazzer b = new Bazzer();

        System.out.println("NUmber");
        int n = s.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("p id");
            int pid = s.nextInt();
            s.nextLine();
            System.out.println("p name");
            String pname = s.nextLine();
            b.addPolicyDetail(pid, pname);
        }
        s.close();


    }
}
