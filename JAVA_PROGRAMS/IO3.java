import java.io.*;

class Student
{
    int rollno;
    String name;
    String dept;
}
public class IO3 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("C:/Users/2317585/OneDrive - Cognizant/Documents/Student2.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        Student s = new Student();
        s.rollno =10;
        s.name = "john";
        s.dept ="CSE";

        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);

        dos.close();
        fos.close();

    }   
}
