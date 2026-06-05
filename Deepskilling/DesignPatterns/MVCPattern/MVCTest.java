package Deepskilling.DesignPatterns.MVCPattern;

public class MVCTest {
    public static void main(String[] args) {
        Student student=new Student("Teja Sree", "05NC");
        View view =new View();
        StudentController sc=new StudentController(student, view);
        sc.showDetails();
    }
}
