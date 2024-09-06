package commandPattern;

public class ViewerApp {
    public static void main(String[] args) {
        Tv tv = new Tv();
        RemoteControl rc = new RemoteControl();

        Command powerOn = new PowerOn(tv);
        rc.setCommand(powerOn);
        System.out.println(rc.pressButton());

        Command powerOff = new PowerOff(tv);
        rc.setCommand(powerOff);
        System.out.println(rc.pressButton());
    }
}
