package pattern.command;

/**
 * @author Yue Lin
 * @since 2018-03-20
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
