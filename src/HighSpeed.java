/**
 * Created by Oriol on 22/03/2017.
 */
public class HighSpeed implements IState {
    @Override
    public String printState(){
        return" high speed ";
    }
    @Override
    public IState nextState() {
        return new Off();
    }

    @Override
    public IState previousState() {
        return new MediumSpeed();
    }
}
