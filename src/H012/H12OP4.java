import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H12OP4 extends Applet {

    private int[] getallen = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25 };
    private String string;
    private TextField tekstvak;
    private int index = -1;
    private boolean gevonden;

    public void init() {
        gevonden = false;
        string = "";
        tekstvak = new TextField("", 5);
        Button knop = new Button("Ok");
        knop.addActionListener(new Listener());
        add(tekstvak);
        add(knop);
    }
    public void paint(Graphics g) {
        g.drawString("" + string, 125, 50);
    }

    private class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int zoeken = Integer.parseInt(tekstvak.getText());
            for (int teller = 0; teller < getallen.length && !gevonden; teller++) {
                index += 2;
                if (getallen[teller] == zoeken) {
                    gevonden = true;
                }
            }
            if (gevonden) {
                string = "De waarde is " + index + " is gevonden!";
            } else {
                string = "Geen waarde gevonden.";
            }
            index = -1;
            tekstvak.setText("");
            gevonden = false;
            repaint(); // FERDI STOP REPAINT TE VERGETEN!!! >:( //
        }
    }
}