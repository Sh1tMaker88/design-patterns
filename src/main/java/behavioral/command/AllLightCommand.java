package behavioral.command;

import java.util.List;

public class AllLightCommand implements Command {

    private List<Light> lights;

    public AllLightCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        System.out.println("        *** All lights command working ***");
        for (Light light : lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
        System.out.println("        *** All lights command finish work ***");
        System.out.println();
    }
}
