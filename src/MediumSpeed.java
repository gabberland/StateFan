/**
 * Created by Oriol on 22/03/2017.
 */
public class MediumSpeed implements IState {
    @Override
    public String printState() {
        return " medium speed ";
    }

    @Override
    public IState nextState() {
        return new HighSpeed();
    }

    @Override
    public IState previousState() {
        return new LowSpeed();
    }
}
