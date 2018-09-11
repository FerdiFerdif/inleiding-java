import java.applet.*;
import java.awt.*;

public class H5OP1 extends Applet {
    Color fillcolor;
    Color linecolor;
    int width;
    int height;

    public void init() {
        fillcolor = Color.magenta;
        linecolor = Color.black;
        width = 100;
        height = 50;
    }



    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(linecolor);
        g.drawLine(150, 30, 30, 30);
        g.drawRect(40, 70, width, height);
        g.drawRoundRect(40, 170, width, height, 20, 20);
        g.setColor(Color.red);
        g.drawString("LIJN", 80, 45);
        g.drawString("RECHTHOEK", 60, 140);
        g.drawString("AFGERONDE RECHTHOEK", 40, 240);
        g.setColor(Color.blue);
        g.drawString("GEVULDE OVAAl", 190, 240);
        g.drawString("GEVULDE UHH?", 140, 140);
        g.setColor(Color.green);
        g.drawString("CIRKEL", 335, 240);
        g.drawString("TAARTPUNT", 300, 140);
        g.setColor(fillcolor);
        g.fillRect(180, 70, width, height);
        g.fillRoundRect(180, 170, width, height, 360, 360);
        g.fillArc(300, 70, width, height, 0, 60);
        g.setColor(linecolor);
        g.drawRoundRect(180, 70, width, height, 360, 360);
        g.drawRoundRect(300, 70, width, height, 360, 360);
        g.drawRoundRect(320, 160, 60, 60, 360, 360);



    }
}

//BLACK AND YELLOW BLACK AND YELLOW BLACK AND YELLOW//