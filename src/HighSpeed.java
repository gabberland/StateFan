/**
 * Created by Oriol on 22/03/2017.
 */
public class HighSpeed implements  State{
    @Override
    public String printState(){
        return" high speed ";
    }
    @Override
    public State nextState() {
        return new Off();
    }

    @Override
    public State previousState() {
        return new MediumSpeed();
    }
}
