package Deepskilling.DesignPatterns.Command;

import java.security.PublicKey;

public class Remote {
    private Command command;
    public void setCommad(Command command){
        this.command=command;
    }
    public void pressButton(){
        command.execute();
    }
}
