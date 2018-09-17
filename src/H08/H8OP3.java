import java.awt.*;
import java.applet.*;

public class H8OP3 extends Applet {
    Button knop;
    Label label;
    TextField tekstvak;

    public void init() {
        tekstvak = new TextField("200 - 21% Belasting", 20);
        label = new Label("BTW ");
        add(label);
        add(tekstvak);
        knop = new Button();
        knop.setLabel( "Ok");  //Ok...//
        add(knop);

    }

    public void paint(Graphics g) {
        repaint();
        tekstvak = new TextField("$158");


    }
}
