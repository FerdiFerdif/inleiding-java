import java.awt.*;
import java.applet.*;

public class H4OP1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.green);
        g.drawLine(30, 120, 250, 120);
        g.drawLine( 30, 120, 150, 30);
        g.drawLine( 250, 120, 150, 30);
    }
}

//man-o-man-oman//