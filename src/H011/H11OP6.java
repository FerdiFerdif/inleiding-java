package H011;

import java.awt.*;
import java.applet.*;


public class H11OP6 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int a = 20;
        int b = 20;
        int c = 0;
        int d = 0;

        for (int i = 0; i < 4; i++) {
            g.drawRoundRect(180 - c, 130 - d, a, b, 360, 360);
            a += 20;
            b += 20;
            c -= -10;
            d -= -10;
        }
    }
}