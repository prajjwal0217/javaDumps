import java.io.FileOutputStream;


public class IO 
{
    public static void main(String[] args) {
        try {
            FileOutputStream fos =  new FileOutputStream("C:/Users/2317585/OneDrive - Cognizant/Documents/Text.txt");
            String str ="java is fun";
            byte b[] = str.getBytes();
            fos.write(b);
            fos.close();
        }
        catch(Exception e){
            System.out.println("File not found");
        }
       
       
    }
}
