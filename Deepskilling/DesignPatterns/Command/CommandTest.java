package Deepskilling.DesignPatterns.Command;

public class CommandTest {
    public static void main(String[] args) {
        Light light=new Light();
        Command command1=new LightOnCommand(light);
        Command command2=new LightOffCommand(light);

        Remote remote=new Remote();
        remote.setCommad(command1);
        remote.pressButton();
        remote.setCommad(command2);
        remote.pressButton();

    }
}
