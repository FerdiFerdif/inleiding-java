package H011;

import java.awt.*;
import java.applet.*;


public class H11OP4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int x = 0;
        int regelhoogte = 50;
        int regelhoogte2 = 50;


        for (int i = 0; i < 11; i++) {
            g.drawString(i + "x 3 =",50, regelhoogte);
            g.drawString(x + "", 90,  regelhoogte2);
            regelhoogte = regelhoogte + 20;
            regelhoogte2 = regelhoogte2 + 20;
            x = x + 3;
        }
    }
}
