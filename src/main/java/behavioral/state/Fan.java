package behavioral.state;

public class Fan {

    State fanOffState;
    State fanLowState;
    State fanMediumState;
    State fanHighState;

    State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMediumState = new FanMediumState(this);
        fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanMediumState() {
        return fanMediumState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
