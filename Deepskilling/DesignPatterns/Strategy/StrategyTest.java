package Deepskilling.DesignPatterns.Strategy;

public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext pc=new PaymentContext(new CreditCardPayment());
    }
}
