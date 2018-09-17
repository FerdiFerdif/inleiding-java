import java.awt.*;
import java.applet.*;

public class H6OP1 extends Applet {
    int i;
    int o;
    int p;
    int uitkomst;

    public void init()  {
        i = 113;
        o = 4;
        uitkomst = i / o;
    }
    public void paint(Graphics g) {
        g.drawString("De uitkomst van de karwei is voor ieder " + uitkomst, 15,15 );}
}

//yay//

