public class RazorpayAdaptor implements PaymentProcessor{
    private RazorpayGateway rpg;
    public RazorpayAdaptor(){
        rpg=new RazorpayGateway();
    }
    @Override
    public void pay(){
        rpg.payRazor();
    }
}
