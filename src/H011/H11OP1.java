package H011;

import java.awt.*;
import java.applet.*;


public class H11OP1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;

        while (teller < 10) {
            x = x + 20;
            g.drawLine(x, 30, x, 200);
            g.drawString("" + teller, x, 25);
            teller++;
        }
    }
}