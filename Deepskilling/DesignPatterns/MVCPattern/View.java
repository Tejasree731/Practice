package Deepskilling.DesignPatterns.MVCPattern;

public class View {
    public void display(Student student){
        System.out.println("Student Name: "+student.getName());
        System.out.println("Student RollNo: "+student.getRollNo());
    }
}
