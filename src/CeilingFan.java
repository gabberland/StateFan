/**
 * Created by Oriol on 22/03/2017.
 */
public class CeilingFan {
    private State current_state;

    public CeilingFan()
    {
        current_state = new IOff();
    }
    public void set_state(State s)
    {
        current_state = s;
    }
    public void click()
    {
        current_state.click(this);
    }
    public String getState() {
        return current_state.getName();
    }
}

