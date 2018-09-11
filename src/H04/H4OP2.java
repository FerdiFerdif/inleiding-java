import java.awt.*;
import java.applet.*;

public class H4OP2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(120, 100, 150, 150);
        g.drawRect(130, 150, 40, 40);
        g.drawRect(200, 150, 45, 100);
        g.drawRoundRect(227, 200, 10, 10, 10, 10);
        g.fillRoundRect(227, 200, 10, 10, 10, 10);


    }
}

//Dit is sowieso het beste deel van een code schrijven. ;)//