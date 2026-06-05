package Deepskilling.DesignPatterns.Strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(){
        System.out.println("Paid through CreditCard!");
    }
}
