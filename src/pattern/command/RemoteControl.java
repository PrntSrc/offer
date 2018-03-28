package pattern.command;

/**
 * @author Yue Lin
 * @since 2018-03-20
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
    }

    public void setCommand(Command command) {
//        slot = command;
    }

    public void buttonWasPressed() {
//        slot.execute();
    }
}
