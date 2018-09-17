import java.awt.*;
import java.applet.*;


public class H8OP2 extends Applet {
    Button knop;

    public void init() {
        knop = new Button();
        knop.setLabel( "man" );
        add(knop);
        knop = new Button();
        knop.setLabel( "vrouw" );
        add(knop);
        knop = new Button();
        knop.setLabel( "jongen" );
        add(knop);
        knop = new Button();
        knop.setLabel( "meisje" );
        add(knop);
    }


    //oh//

    public void paint(Graphics g) {
        g.drawString("Klik op 1 knop?", 165, 60 );
    }
}