/**
 * Created by Oriol on 22/03/2017.
 */
public class LowSpeed implements IState {
    @Override
    public String printState() {
        return" low speed ";
    }

    @Override
    public IState nextState() {
        return new MediumSpeed();
    }

    @Override
    public IState previousState() {
        return new Off();
    }

}
