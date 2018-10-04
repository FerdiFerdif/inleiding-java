package H011;

import java.awt.*;
import java.applet.*;


public class H11OP9 extends Applet {

    @Override
    public void init() {
        setSize(600, 600);

    }

    @Override
    public void paint(Graphics g) {
        int x = 50;

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                g.drawRect(x, 50, 50, 50);
                g.fillRect(x, 50, 50, 50);
            } else {
                g.drawRect(x, 50, 50, 50);
            }
            x += 50;
        }

        x = 50;
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                g.drawRect(x, 100, 50, 50);
                g.fillRect(x, 100, 50, 50);
            } else {
                g.drawRect(x, 100, 50, 50);
            }
            x += 50;
        }
        x = 50;
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                g.drawRect(x, 150, 50, 50);
                g.fillRect(x, 150, 50, 50);
            } else {
                g.drawRect(x, 150, 50, 50);
            }
            x += 50;
        }

        x = 50;
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                g.drawRect(x, 200, 50, 50);
                g.fillRect(x, 200, 50, 50);
            } else {
                g.drawRect(x, 200, 50, 50);
            }
            x += 50;

        }
        x = 50;
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                g.drawRect(x, 250, 50, 50);
                g.fillRect(x, 250, 50, 50);
            } else {
                g.drawRect(x, 250, 50, 50);
            }
            x += 50;
        }

        x = 50;
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                g.drawRect(x, 300, 50, 50);
                g.fillRect(x, 300, 50, 50);
            } else {
                g.drawRect(x, 300, 50, 50);
            }
            x += 50;
        }
        x = 50;
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                g.drawRect(x, 350, 50, 50);
                g.fillRect(x, 350, 50, 50);
            } else {
                g.drawRect(x, 350, 50, 50);
            }
            x += 50;
        }

        x = 50;
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                g.drawRect(x, 400, 50, 50);
                g.fillRect(x, 400, 50, 50);
            } else {
                g.drawRect(x, 400, 50, 50);
            }
            x += 50;

        }
    }
}