package Deepskilling.DesignPatterns.Observer;
import java.util.*;

public class StockMarket implements Stock{
    List<User> users=new ArrayList<>();

    @Override
    public void register(User a){
        users.add(a);
    }

    @Override
    public void deregister(User a){
        users.remove(a);
    }

    @Override
    public void notifyUsers(String msg){
        for(User o : users){
            o.update(msg);
        }
    }
}
