class Students{
    private String name;
    private int rollNo;
    private String course;
    private int m1,m2,m3;

    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String course(){
        return course;
    }
    public int getm1(){
        return m1;
    }
    public int getm2(){
        return m2;
    }
    public int getm3(){
        return m3;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRollNO(int rollNo){
        this.rollNo = rollNo;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setm(int m1,int m2,int m3){
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public String toString(){
        return "The details of student are \n name: "+name+"\n Roll No: "+rollNo+"\n Course: "+course;
    }
    
    public int total(){
        return m1+m2+m3;
    }
    public double average(){
        return (double)total()/3;
    }
    public char grade(){
        if(average()>60) return 'A';
        return 'B';
    }
}

public class oops2 {

    public static void main(String[] args) {

       Students s1 = new Students();

      s1.setName("Prajjwal Mahajan");
      s1.setRollNO(42);
      s1.setCourse("EEE");
      s1.setm(83, 84, 95);

       System.out.println(s1.total());
       System.out.println(s1.average());
       System.out.println(s1.grade());
       System.out.println(s1);
        
    }
    
}
