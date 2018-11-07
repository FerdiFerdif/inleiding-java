import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class H12OP3 extends Applet {
    TextField[] tekstvakken;
    Button knop;


    public void init() {
        tekstvakken = new TextField[5];
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());


        // Array vullen
        for (int i = 0; i < tekstvakken.length; i++) {
            TextField tf = new TextField("", 3);
            tekstvakken[i] = tf;
            add(tekstvakken[i]);
        }

        add(knop);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int[] inputs = new int[5];

            for (int i = 0; i < tekstvakken.length; i++) {
                String s = tekstvakken[i].getText();
                int input = Integer.parseInt(s);
                inputs[i] = input;
            }

            Arrays.sort(inputs);

            for (int i = 0; i < tekstvakken.length; i++) {
                tekstvakken[i].setText("" + inputs[i]);

            }

        }
    }
}