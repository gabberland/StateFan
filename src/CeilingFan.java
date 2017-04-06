/**
 * Created by Oriol on 22/03/2017.
 */
public class CeilingFan {

    private IState currentIState;

    public CeilingFan() {
        currentIState = new Off();
    }

    public String pullNext() {
        setCurrentIState(currentIState.nextState());
        return currentIState.printState();

    }

    public void pullPrevious() {
        setCurrentIState(currentIState.previousState());
        currentIState.printState();
    }

    public void setCurrentIState(IState currentIState) {
        this.currentIState = currentIState;
    }

    public String getCurrentIState() {
        return currentIState.printState();
    }
}

