import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Àlex on 25/3/2017.
 */
public class GUIStateFan {


    private JPanel panel;
    private JTextField textField1;
    private JButton LowState;
    private JButton MediumState;
    private JButton TurnOn;
    private JButton OffState;
    private JTextField clickTheButtonToTextField;
    CeilingFan button = new CeilingFan();
    String stateText;
    int state = 0; //turned off
    IOff off = new IOff();
    ILow low = new ILow();
    IMedium med = new IMedium();
    IHigh high = new IHigh();

    public GUIStateFan() {
        TurnOn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button.click();
            }
        });
    }

    public void init() {
        JFrame jf = new JFrame("Fan");
        jf.setContentPane(panel);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setSize(300,300);
        jf.setVisible(true);

        while (true) {

            textField1.setText(String.valueOf(button.getState()));

        }
    }
}
