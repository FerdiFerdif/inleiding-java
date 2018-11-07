import java.awt.*;
import java.applet.*;

public class H12OP1 extends Applet {
    double salaris[];
    double gemiddelde;

    public void init() {
        salaris = new double[10];
        gemiddelde = 0;

        for (int teller = 0; teller < 10; teller++) {
            salaris[teller] = 1 * (teller + 1);

        }

        for (int i = 0; i < 10; i++) {
            gemiddelde = gemiddelde + salaris[i];
        }
        gemiddelde = gemiddelde / salaris.length;

        }


    @Override
    public void paint(Graphics g) {

        for (int teller = 0; teller < salaris.length; teller ++)
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
        g.drawString("Het gemiddelde is : " + gemiddelde, 100, 250);
    }
}