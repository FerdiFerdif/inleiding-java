import java.awt.*;
import java.applet.*;

public class H6OP3 extends Applet {
    int t;
    int y;
    int u;
    int i;
    int o;
    int uitkomst;
    int uitkomst2;

    public void init() {
        t = 2147483647;               //lol//
        y = 1;
        uitkomst = (t + y);
    }
    public void paint(Graphics g) {
        g.drawString("Dit gaat negatief worden..  " + uitkomst, 15,15);
    }
}



