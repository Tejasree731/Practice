package Deepskilling.DesignPatterns.Decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Notifier notifier1=new EmailNotifier();
        notifier1=new SmsNotifierDecorator(notifier1);
        notifier1.send();
        Notifier notifier2=new EmailNotifier();
        notifier2=new SlackNotifyDecorator(notifier2);
        notifier2.send();
    }
}
