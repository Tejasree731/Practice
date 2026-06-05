package Deepskilling.DesignPatterns.MVCPattern;

public class Student {
    private String name;
    private String rollno;

    public Student(String name,String rollno){
        this.name=name;
        this.rollno=rollno;
    }

    public String getName(){ return this.name;}
    public String getRollNo(){ return this.rollno;}
}
