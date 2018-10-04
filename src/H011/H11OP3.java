package H011;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class H11OP3 extends Applet {
    int a;
    int b;
    int c;
    String output;

    @Override
    public void init() {
        a = 0;
        b = 1;
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 10 ; i++);
             a = b;
             b = c;
             c = a + b;
             output = "" + c;
    }
}