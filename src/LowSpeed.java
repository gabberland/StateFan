/**
 * Created by Oriol on 22/03/2017.
 */
public class LowSpeed implements State {
    @Override
    public String printState() {
        return" low speed ";
    }

    @Override
    public State nextState() {
        return new MediumSpeed();
    }

    @Override
    public State previousState() {
        return new Off();
    }

}
