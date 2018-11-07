import java.awt.*;
import java.applet.*;

public class H12OP2 extends Applet {
    Button[] knoppen;

    public void init() {
        knoppen = new Button[25];


        // Array vullen
        for (int teller = 0; teller < 25; teller++) {
            knoppen[teller] = new Button("OK");
            add(knoppen[teller]);
        }
    }
    @Override
    public void paint(Graphics g) {
    }
}