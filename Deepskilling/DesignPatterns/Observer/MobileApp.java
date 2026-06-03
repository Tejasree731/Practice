package Deepskilling.DesignPatterns.Observer;

public class MobileApp implements User{
    
    private String name;
    MobileApp(String name){
        this.name=name;
    }
    
    @Override
    public void update(String msg){
        System.out.println(this.name+" :Received "+msg);
    }
}
