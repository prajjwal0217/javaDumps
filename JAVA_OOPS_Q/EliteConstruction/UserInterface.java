package EliteConstruction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class UserInterface {
    
    public static ProjectInfo extractDetails(String projectDetails) throws ParseException{
        
        String info[] = projectDetails.split(":");
        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        
        try{
            LocalDate dor = LocalDate.parse(info[3],df);
            LocalDate doc = LocalDate.parse(info[4],df);
            ProjectInfo obj = new ProjectInfo(info[0],info[1],Integer.parseInt(info[2]),dor,doc);
            return obj;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String args[]) throws ParseException{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Project Details");
        String projectDetails = s.nextLine();
        ProjectInfo obj = new ProjectInfo();
        obj = extractDetails(projectDetails);
        System.out.println("Project Id: "+obj.getProjectId());
        System.out.println("Construction Type: "+obj.getConstructionType());
        System.out.println("Total Square Feet: "+obj.getTotalSquareFeet());
        System.out.println("Date Of Registration: "+obj.getDateOfRegistration());
        System.out.println("Date Of Completion: "+obj.getDateOfCompletion());
        System.out.println("Amount to be paid by the Customer: "+obj.calculateAmountTobePaid());
        s.close();

    }

}
