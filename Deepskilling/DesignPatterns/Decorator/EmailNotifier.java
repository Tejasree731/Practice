package Deepskilling.DesignPatterns.Decorator;

public class EmailNotifier implements Notifier{
    @Override
    public void send(){
        System.out.println("Notification sent thorugh Email!");
    }
}
