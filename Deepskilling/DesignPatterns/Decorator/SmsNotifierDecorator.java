package Deepskilling.DesignPatterns.Decorator;

public class SmsNotifierDecorator extends NotifierDecorator{
    public SmsNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void send(){
        notifier.send();
        System.out.println("Sent thorugh SMS");
    }
}
