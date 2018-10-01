import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class H8OP2 extends Applet {
    Button Show;
    String Mannen;
    String Vrouwen;
    String Totaal;

    @Override
    public void init() {
        Mannen = "";
        Vrouwen = "";
        Totaal = "";
        Show = new Button("Laat Aantal Zien");
        Show.addActionListener(new AOT());
        add(Show);

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Het aantal mannen is  " + Mannen, 130,100);
        g.drawString("Het aantal vrouwen is " + Vrouwen, 130,120);
        g.drawLine(125, 125, 270, 125);
        g.drawString("Het totaal aantal is   " + Totaal,130,140);

    }

    class AOT implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Mannen = "50";
            Vrouwen = "47";
            Totaal = "97";
            repaint();
        }
    }
}
