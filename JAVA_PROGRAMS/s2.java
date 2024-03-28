import java.util.*;

class Student{
    private String name;
    private String rollNo;
    private static int count = 0;

    private String generateRollNo(){
        
        
        String rollNo = "Univ-"+"2024"+"-"+(++count);
        return rollNo;
    }

    public Student(String name){
        this.name = name;
        rollNo = generateRollNo();
    }

    public void info(){
        System.out.println("The student "+name+"has roll number "+rollNo);
    }
}
public class s2 {
    public static void main(String[] args) {
        Student s1 = new Student("John penny");
        Student s2 = new Student("John simth");
        Student s3 = new Student("sam altman");
        Student s4 = new Student("Dean ankle");
        s1.info();
        s2.info();
        s3.info();
        s4.info();

    }
}
