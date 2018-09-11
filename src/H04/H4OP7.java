import java.awt.*;
import java.applet.*;

public class H4OP7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRoundRect(100, 50, 200, 200, 40, 40);
        g.setColor(Color.white);
        g.fillRoundRect(130, 80, 50, 50, 360, 360);
        g.fillRoundRect(130, 170, 50, 50, 360, 360);
        g.fillRoundRect(220, 170, 50, 50 ,360, 360);
        g.fillRoundRect(220, 80, 50, 50 ,360, 360);

    }
}

//''I see thugs in security check, disguised as business man!''//