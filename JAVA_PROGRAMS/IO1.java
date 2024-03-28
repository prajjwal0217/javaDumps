import java.io.FileInputStream;

public class IO1 {
    public static void main(String[] args) {
        
        try{
            FileInputStream fis = new FileInputStream("C:/Users/2317585/OneDrive - Cognizant/Documents/Text.txt");
            byte b[] = new byte[fis.available()]; 
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
            fis.close();
        }
        catch(Exception e){
            System.out.println("File not found");
        }

    }
}