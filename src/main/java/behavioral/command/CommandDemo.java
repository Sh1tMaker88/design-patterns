package behavioral.command;

import java.util.ArrayList;
import java.util.List;

//client
public class CommandDemo {
    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

//        Command onCommand = new OnCommand(bedroomLight);
//        lightSwitch.storeAndExecute(onCommand);

        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);
        Command allLightsCommand = new AllLightCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
