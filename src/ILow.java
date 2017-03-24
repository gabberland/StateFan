/**
 * Created by Oriol on 22/03/2017.
 */
public class ILow implements State {
    public void click(CeilingFan fan)
    {
        fan.set_state(new IMedium());
        System.out.println("Turnning to medium speed");
    }
}
