import java.util.*;

import ValidateName.UserMainCode; 

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int b = UserMainCode.validateDate(s1);
        if(b ==1){
            System.out.println("Valid date format");
        }else{
            System.out.println("Invalid date format");
        }
        s.close();
    }
}
