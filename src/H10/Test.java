package H10;

import java.applet.Applet;
import java.awt.*;

public class Test extends Applet {

    public void init() {}

    @Override
    public void paint(Graphics g) {
        g.drawString("" + 8 + "  is bigger than  " + 5 + ": " + (8 > 5), 50, 60);
        g.drawString("" + 8 + "  is smaller than " + 5 + ": " + (5 > 8), 50,80);
        g.drawString("" + 10 + " is bigger than " + 5 + ": " + (10> 5), 50, 100);
        g.drawString("" + 59 + " is smaller than " + 15 + ": " + (59< 15), 50, 120);
        g.drawString("" + 25 + " is bigger than " + 12 + ": " + (25>12), 50,140);
        g.drawString("" + 90 + " is bigger than " + 25 + ": " + (90>25), 50, 160);


    }
}
