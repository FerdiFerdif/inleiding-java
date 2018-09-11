import java.awt.*;
import java.applet.*;

public class H4OP8 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawString("AFGERONDE RECHTHOEK", 40, 240);
        g.drawLine(150, 30, 30, 30);
        g.drawRect(40, 70, 100, 50);
        g.drawRoundRect(40, 170, 100, 50, 20, 20);
        g.setColor(Color.red);
        g.drawString("LIJN", 80, 45);
        g.drawString("RECHTHOEK", 60, 140);
        g.setColor(Color.blue);
        g.drawString("GEVULDE OVAAL", 190, 240);
        g.drawString("GEVULDE UUH?", 140, 140);
        g.setColor(Color.green);
        g.drawString("CIRKEL", 335, 240);
        g.drawString("TAARTPUNT", 300, 140);
        g.setColor(Color.magenta);
        g.fillRect(180, 70, 100, 50);
        g.fillRoundRect(180, 170, 100, 50, 360, 360);
        g.fillArc(300, 70, 100, 50, 0, 60);
        g.setColor(Color.black);
        g.drawRoundRect(180, 70, 100, 50, 360, 360);
        g.drawRoundRect(300, 70, 100, 50, 360, 360);
        g.drawRoundRect(320, 160, 60, 60, 360, 360);





    }
}

//leuk.//