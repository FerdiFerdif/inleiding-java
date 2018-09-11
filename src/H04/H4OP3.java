import java.awt.*;
import java.applet.*;




public class H4OP3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(100, 100, 200, 33);
        g.setColor(Color.white);
        g.fillRect(100, 133, 200, 33);
        g.setColor(Color.blue);
        g.fillRect(100, 166, 200, 33);
        g.setColor(Color.orange);
        g.fillRect(100, 100, 20, 200);
    }
}

//yep, een nederlandse flag! is dit niet voor mensen bedoeld die in de andere lokalen naast ons zitten, ehhh?//