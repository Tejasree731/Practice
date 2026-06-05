package Deepskilling.DesignPatterns.Strategy;

public class PaymentContext {
    private PaymentStrategy ps;
    PaymentContext(PaymentStrategy ps){
        this.ps=ps;
        payy();
    }
    public void payy(){
        ps.pay();
    }
}
