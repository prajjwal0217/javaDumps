package HideYourGrade;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserInterface {
    public static Recruitment extractDetails(String recruitmentDetails) throws ParseException{
        String info[] = recruitmentDetails.split(":");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dop = df.parse(info[3]);
        Recruitment obj = new Recruitment(info[0],info[1],info[2],dop);
        return obj;
    }

    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        String details =s.nextLine();
        Recruitment obj = new Recruitment();
        obj = extractDetails(details);
        
        if(obj.calculatePackageReceived() == -1){
            System.out.println("Invalid details");
        }else{
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String dop = df.format(obj.getDateOfPost());
            System.out.println("Recruitment Id:"+obj.getRecruitmentId());
            System.out.println("Company Name:"+obj.getCompanyName());
            System.out.println("Job Title:"+obj.getJobTitle());
            System.out.println("Date of Post:"+dop);
            System.out.println("Package paid by the Company is "+String.format("%.2f",obj.calculatePackageReceived()));
        }
        s.close();

    }
}
