package H011;

import java.awt.*;
import java.applet.*;


public class H11OP8 extends Applet {

    @Override
    public void init() {
        setSize(1200,1200);

    }

    @Override
    public void paint(Graphics g) {
        int a = 10;
        int b = 10;
        int c = 0;
        int d = 0;
        int e = 10;
        int f = 10;

        for (int i = 0; i < 100; i++) {
            g.drawRoundRect(600 - c, 500 - d, a, b, e, f);
            a += 5;
            b += 5;
            c -= -5;
            d -= -5;
            e += +10;
            f += +10;
        }
    }
}