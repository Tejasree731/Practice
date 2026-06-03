package Deepskilling.DesignPatterns.Observer;

public class WebApp implements User{
    private String name;
    WebApp(String name){
        this.name=name;
    }
    
    @Override
    public void update(String msg){
        System.out.println(this.name+" :Received "+msg);
    }
}
