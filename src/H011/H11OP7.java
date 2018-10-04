package H011;

import java.awt.*;
import java.applet.*;


public class H11OP7 extends Applet {

    @Override
    public void init() {
        setSize(600,600);

    }

    @Override
    public void paint(Graphics g) {
        int a = 10;
        int b = 10;
        int c = 0;
        int d = 0;

        for (int i = 0; i < 30; i++) {
            g.drawRoundRect(300 - c, 300 - d, a, b, 360, 360);
            a += 10;
            b += 10;
            c -= -5;
            d -= -5;
        }
    }
}