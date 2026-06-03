package Deepskilling.DesignPatterns.Observer;

import java.util.Observer;

public interface Stock {
    public void register(User u);
    public void deregister(User u);
    public void notifyUsers(String msg);
}
