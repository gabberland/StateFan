/**
 * Created by Oriol on 22/03/2017.
 */
public class IMedium implements State {
    public void click(CeilingFan fan)
    {
        fan.set_state(new IHigh());
        System.out.println("Turnning to the highest speed");
    }
}