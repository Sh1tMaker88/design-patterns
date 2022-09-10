package behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();
    }
}
