package Deepskilling.DesignPatterns.MVCPattern;

public class StudentController {
    private Student model;
    private View view;
    public StudentController(Student model,View view){
        this.model=model;
        this.view=view;
    }
    public void showDetails(){
        view.display(model);
    }
}
