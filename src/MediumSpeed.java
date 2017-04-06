/**
 * Created by Oriol on 22/03/2017.
 */
public class MediumSpeed implements State {
    @Override
    public void printState() {
        System.out.println(" medium speed ");
    }

    @Override
    public State nextState() {
        return new HighSpeed();
    }

    @Override
    public State previousState() {
        return new LowSpeed();
    }
}
