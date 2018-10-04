package H011;

import java.awt.*;
import java.applet.*;


public class H11OP5 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int a = 20;
        int b = 20;
        int c = 0;

        for (int i = 0; i < 5; i++) {
            g.drawRect(a, b, 50, 50);
            a += 50;
            b += 50;
        }
    }
}