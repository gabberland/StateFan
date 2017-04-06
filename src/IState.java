/**
 * Created by Oriol on 22/03/2017.
 */
public interface IState {
    String printState();
    IState nextState();
    IState previousState();
}
