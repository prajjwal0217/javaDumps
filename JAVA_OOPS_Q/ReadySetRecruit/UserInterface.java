package ReadySetRecruit;
import java.util.Scanner;

public class UserInterface {
    
    public static AnalystInfo extractDetails(String analystDetails){
        return null;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String analystDetails = s.nextLine();
        AnalystInfo obj = new AnalystInfo();
        obj = extractDetails(analystDetails);
        if(obj.calculateAnalystSalary() == -1){
            System.out.println("Invalid details");
        }else{
            System.out.println("Analyst Id: "+obj.getAnalystId());
            System.out.println("Analyst Name: "+obj.getAnalystName());
            System.out.println("Cyber Security Type: "+obj.getCyberSecurityType());
            System.out.println("Job Title: "+obj.getJobTitle());
            System.out.println("Salary paid to the Analyst:"+obj.calculateAnalystSalary());
        }
        s.close();
    }
}
