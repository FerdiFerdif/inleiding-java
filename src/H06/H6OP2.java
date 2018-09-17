import java.awt.*;
import java.applet.*;

public class H6OP2 extends Applet {
   int t;
   int y;
   int u;
   int o;
   int p;
   int uitkomst;
   int ikwildood;
   int neeeeeee;

   public void init() {
       t = 60;
       y = 60;
       o = 24;
       p = 12;
       u = 3600;
       uitkomst = (t * y);       //SECONDEN IN EEN UUR//
       ikwildood = (o * u);      //SECONDEN IN EEN DAG//
       neeeeeee  = (p * u);      //SECONDEN IN EEN JAAR//
   }
   public void paint(Graphics g) {
       g.drawString("Er zitten " + uitkomst + " Seconden in een uur.", 15,15);
   g.drawString("Er zitten " + ikwildood + "Seconden in een dag.", 15,30);
   g.drawString("Er zitten " + neeeeeee + "Seconden in een jaar.", 15, 45);
   }
}