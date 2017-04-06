/**
 * Created by Oriol on 22/03/2017.
 */
public class CeilingFan {

    private State currentState;

    public CeilingFan() {
        currentState = new Off();
    }

    public void pullGreen() {
        setCurrentState(currentState.nextState());
        currentState.printState();

    }

    public void pullRed() {
        setCurrentState(currentState.previousState());
        currentState.printState();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}

