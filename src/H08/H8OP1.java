import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8OP1 extends Applet{
    TextField tekstvak;
    Button knop,knop2;
    Label label;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop2 = new Button("Reset");
        knop.addActionListener(new KnopListener());
        knop2.addActionListener(new KnopListener2());
        add(tekstvak);
        add(knop);
        add(knop2);

        label = new Label("Type iets in het  tekstvakje");
        add(label);
    }

    public void paint(Graphics g) {
        g.drawString("Type een hele lange ... " +
                "in het tekstvakje " +
                "en klik op Ok", 50, 60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("Jammer, " +
                    "maar nu staat er iets anders");
            repaint();
        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText(" " +
                    "");
            repaint();
        }
    }
}