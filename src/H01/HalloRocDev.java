import java.awt.*;
import java.applet.*;

public class HalloRocDev extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.red);
        g.setColor(Color.yellow);
        g.drawRect(60, 5, 50, 50);
        g.drawRect(260, 5, 50, 50);
        g.fillRect(60, 200, 250, 50);
        g.drawOval(160, 70  , 50, 55);
    }
}