import java.awt.*;
import java.applet.*;

public class H12OP6 extends Applet {


    private double uitkomst;
    private double getal[];

    public void init() {
        getal = new double [10];
        for (int teller = 0; teller < getal.length; teller ++) {
            getal[teller] = 5 * teller + 7;
            uitkomst = (getal[0] + getal[1] + getal[2] + getal[3] + getal[4] + getal[5] + getal[6] + getal[7] +
                    getal[8] + getal[9]) / 10; // IS.. //
        }
    }
    public void paint(Graphics G) {
        for (int teller = 0; teller < getal.length; teller ++) {
            G.drawString("" + getal[teller], 50, 20 * teller + 20);
            G.drawString("Het gemiddelde is.. " + uitkomst, 50, 240);
        }
    }
}