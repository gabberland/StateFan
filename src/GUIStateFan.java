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
    private JButton HighState;
    private JButton OffState;
    private JTextField clickTheButtonsToTextField;
    CeilingFan button = new CeilingFan();
    String stateText;
    int state = 0; //turned off
    IOff off = new IOff();
    ILow low = new ILow();
    IMedium med = new IMedium();
    IHigh high = new IHigh();

    public GUIStateFan() {
        LowState.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button.set_state(low);
                stateText = "Fan turned to LOW state";

            }
        });
        MediumState.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button.set_state(med);
                stateText = "Fan turned to MEDIUM state";
            }
        });
        HighState.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button.set_state(high);
                stateText = "Fan turned to HIGH state";
            }
        });
        OffState.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button.set_state(off);
                stateText = "Fan turned OFF";
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

            button.click();
            textField1.setText(stateText);

        }
    }
}
