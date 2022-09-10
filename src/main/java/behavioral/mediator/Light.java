package behavioral.mediator;

//receiver
public class Light {

    private boolean isOn;
    private String location;

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void on() {
        System.out.println("Light switched on");
    }

    public void off() {
        System.out.println("Light switched off");
    }
}
