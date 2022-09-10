package behavioral.command;

public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("        *** Toggle command working ***");
        light.toggle();
        System.out.println("        *** Toggle command finish work ***");
        System.out.println();
    }
}
