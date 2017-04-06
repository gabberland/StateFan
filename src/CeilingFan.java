/**
 * Created by Oriol on 22/03/2017.
 */
public class CeilingFan {

    private State currentState;

    public CeilingFan() {
        currentState = new Off();
    }

    public String pullNext() {
        setCurrentState(currentState.nextState());
        return currentState.printState();

    }

    public void pullPrevious() {
        setCurrentState(currentState.previousState());
        currentState.printState();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public String getCurrentState() {
        return currentState.printState();
    }
}

