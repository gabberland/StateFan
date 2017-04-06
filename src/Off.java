/**
 * Created by Oriol on 22/03/2017.
 */
public class Off implements IState {
    @Override
    public String printState() {
        return" fan is off ";
    }

    @Override
    public IState nextState() {
        return new LowSpeed();
    }

    @Override
    public IState previousState() {
        return new HighSpeed();
    }

}
