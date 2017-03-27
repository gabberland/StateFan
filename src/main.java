import java.util.Scanner;

/**
 * Created by Oriol on 22/03/2017.
 */
public class main {
    public static void main(String[] args)
    {
        CeilingFan button = new CeilingFan();
        GUIStateFan gui = new GUIStateFan();
        gui.init();
        /*
        while (true)
        {
            System.out.println(Press" x to toggle the mode");
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextLine().equals("x"))
                button.click();
        }*/
    }
}
