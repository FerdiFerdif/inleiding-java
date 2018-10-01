import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8OP1 extends Applet {
    Button knop;
    Button knop2;
    TextField tekstvak;
    Label label;
    String schermtekst;

    @Override
    public void init() {
        setSize(600, 300);
        schermtekst = "";
        label = new Label("Klik op OK voor tekst, klik op reset om het te resetten");
        tekstvak = new TextField("", 40);
        knop = new Button("OK");
        knop.addActionListener(new OK());
        knop2 = new Button("RESET");
        knop2.addActionListener(new RESET());
        add(label);
        add(tekstvak);
        add(knop);
        add(knop2);

    }

    @Override
    public void paint(Graphics g) {
        g.drawString(schermtekst, 100, 100);

    }

    class OK implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvak.getText();
            repaint();
        }



        }
    class RESET implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            schermtekst = tekstvak.getText();
            repaint();
        }
    }
}





