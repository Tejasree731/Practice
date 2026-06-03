package Deepskilling.DesignPatterns.Observer;

public class ObserverTest {
    public static void main(String[] args) {
        StockMarket sm= new StockMarket();
        User o1=new MobileApp("MobileApp");
        sm.register(o1);
        User o2=new WebApp("WebApp");
        sm.register(o2);
        sm.notifyUsers("Profit");
    }
}
