/**
 * Created by Oriol on 22/03/2017.
 */
public class IOff implements State {
    public void click(CeilingFan fan)
    {
        fan.set_state(new ILow());
    }
}
