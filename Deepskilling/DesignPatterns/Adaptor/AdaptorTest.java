public class AdaptorTest {
    public static void main(String[] args) {
        PaymentProcessor p=new RazorpayAdaptor();
        p.pay();
    }
}
