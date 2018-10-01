import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H8OP3 extends Applet {
    TextField tekstveld;
    Label label;
    Button knop;
    String prijs;
    double getal;
    double a;

    public void init() {
        setSize(600, 300);
    tekstveld = new TextField("",30);
    label = new Label("Prijs exclusief BTW");
    knop = new Button("Bereken");
    knop.addActionListener(new BTWKNOP());
    prijs = new String("");
    add(label);
    add(tekstveld);
    add(knop);
    a = 1.21;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("De prijs inclusief BTW is " + getal * a + " euro",50,60);
    }

    class BTWKNOP implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        String prijs = tekstveld.getText();
        getal = Double.parseDouble(prijs);

        repaint();



        }
    }
}