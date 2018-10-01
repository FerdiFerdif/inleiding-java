import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10OP1 extends Applet {
    TextField tekstvak;
    int invoergetal;
    int hoogstegetal;
    int laagstegetal;
    Label label;
    String schermtekst;

    @Override
    public void init() {
        tekstvak = new TextField("", 30);
        tekstvak.addActionListener(new Bruh());
        label = new Label("Vul een getal in");
        schermtekst = "";
        add(label);
        add(tekstvak);
        hoogstegetal = Integer.MIN_VALUE;
        laagstegetal = Integer.MAX_VALUE;


    }

    @Override
    public void paint(Graphics g) {


        if (hoogstegetal == Integer.MIN_VALUE) {
            g.drawString("Het hoogste getal is", 50, 60);
        } else {
            g.drawString("Het hoogste getal is " + hoogstegetal, 50, 60);
        }
        if (laagstegetal == Integer.MAX_VALUE) {
            g.drawString("Het laagste getal is ", 50, 80);
        } else {
            g.drawString("Het laagste getal is " + laagstegetal, 50, 80);

        }
    }
    class Bruh implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            invoergetal = Integer.parseInt(s);
            if(hoogstegetal < invoergetal) {
                hoogstegetal = invoergetal;

            }
            if (laagstegetal > invoergetal) {
                laagstegetal = invoergetal;
            }
            repaint();
        }
    }
}