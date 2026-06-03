package Deepskilling.DesignPatterns.Decorator;

abstract class NotifierDecorator implements Notifier{
    protected Notifier notifier;
    public NotifierDecorator(Notifier notifier){
        this.notifier=notifier;
    }
}
