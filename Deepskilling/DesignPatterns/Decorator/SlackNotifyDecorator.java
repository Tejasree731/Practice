package Deepskilling.DesignPatterns.Decorator;

public class SlackNotifyDecorator extends NotifierDecorator{
    public SlackNotifyDecorator(Notifier notifier){
        super(notifier);
    }
    @Override
    public void send(){
        notifier.send();
        System.out.println("Sent through Slack!");
    }
}
