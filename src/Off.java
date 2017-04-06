/**
 * Created by Oriol on 22/03/2017.
 */
public class Off implements State {
    @Override
    public void printState() {
        System.out.println(" fan is off ");
    }

    @Override
    public State nextState() {
        return new LowSpeed();
    }

    @Override
    public State previousState() {
        return new HighSpeed();
    }
}
