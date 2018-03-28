package pattern.command;

/**
 * @author Yue Lin
 * @since 2018-03-20
 */
public class GarageDoor {

    private Light light;

    public GarageDoor() {
        light = new Light();
    }

    public void up() {
        System.out.println("Garage door up");
    }

    public void down() {
        System.out.println("Garage door down");
    }

    public void stop() {
        System.out.println("Garage door stop");
    }

    public void lightOn() {
        light.on();
    }

    public void lightOff() {
        light.off();
    }

}
