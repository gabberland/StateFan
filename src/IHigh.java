/**
 * Created by Oriol on 22/03/2017.
 */
public class IHigh implements  State{
    public void click(CeilingFan fan)
    {
        fan.set_state(new IOff());
    }

    @Override
    public String getName() {
        return "High Level";
    }
}
