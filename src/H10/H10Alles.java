import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10Alles extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    int maandnummer;
    int jaarnummer;
    Label label;
    String schermtekst;
    String tekst;
    Label label2;

    @Override
    public void init() {
        setSize(600,300);
        setBackground(Color.LIGHT_GRAY);
        tekstvak = new TextField("",40);
        tekstvak.addActionListener(new knop());
        tekstvak2 = new TextField("",40);
        tekstvak2.addActionListener(new knop2());
        label = new Label("Vul het maandnummer in en druk op enter : ");
        label2 = new Label("Vul het jaartal in en druk op enter : ");
        add(label);
        add(tekstvak);
        add(label2);
        add(tekstvak2);

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Het maandnummer is : " + schermtekst,50,180);
        g.drawString("Het jaartnummer is : " + tekst,50,200);

    }

    class knop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;


            s = tekstvak.getText();
            maandnummer = Integer.parseInt( s);
            switch(maandnummer) {
                case 1:
                    schermtekst = "Januari | 31 dagen";
                    break;
                case 2:
                    schermtekst = "Februari | 28 dagen | 29 dagen if schrikkeljaar";
                    break;
                case 3:
                    schermtekst = "Maart | 31 dagen";
                    break;
                case 4:
                    schermtekst = "April | 30 dagen";
                    break;
                case 5:
                    schermtekst = "Mei | 31 dagen";
                    break;
                case 6:
                    schermtekst = "Juni | 30 dagen";
                    break;
                case 7:
                    schermtekst = "Juli | 31 dagen";
                    break;
                case 8:
                    schermtekst = "Augustus | 31 dagen";
                    break;
                case 9:
                    schermtekst = "September | 30 dagen";
                    break;
                case 10:
                    schermtekst = "October | 31 dagen";
                    break;
                case 11:
                    schermtekst = "November | 30 dagen";
                    break;
                case 12:
                    schermtekst = "December | 31 dagen";
                    break;
                default:
                    schermtekst = "Ja, das toch geen maand.. Gappie!";
                    break;
            }
                repaint();
            }
        }
    class knop2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        String a;
            a = tekstvak2.getText();
            jaarnummer = Integer.parseInt(a);
            if ( (jaarnummer % 4 == 0 && !(jaarnummer % 100 == 0)) ||
                    jaarnummer % 400 == 0 ) {
                tekst = ""+ jaarnummer + " is een schrikkeljaar";
            }
            else {
                tekst = "" + jaarnummer + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}