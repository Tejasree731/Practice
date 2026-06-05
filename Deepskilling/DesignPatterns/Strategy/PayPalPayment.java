package Deepskilling.DesignPatterns.Strategy;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(){
        System.out.println("Paid through Paypal!");
    }
}
