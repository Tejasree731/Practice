public class SingletonTest {
   public SingletonTest() {
   }

   public static void main(String[] var0) {
      Logging var1 = Logging.getInstance();
      var1.logs("User logged in!");
   }
}

class Logging{
    private static Logging instance;
    private Logging(){}
    public static Logging getInstance(){
        if(instance==null) return new Logging();
        return instance;
    }
    public void logs(String message){
        System.out.println("[LOG] "+message);
    }
    
}
