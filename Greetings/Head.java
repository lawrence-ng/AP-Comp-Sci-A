
import java.awt.*;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Head extends JPanel
{
     private int width;    
   private int height;
   private int[] x = {125, 200, 100};
   private int[] y = {425, 425, 380};
   private int[] x2 = {225, 275, 300};
   private int[] y2 = {425, 425, 380};
  public Head(int w, int h)
  {
      width = w;
      height = h;
}

  // Draws the rainbow.
  
  public void draw(Graphics g)
  {
      Graphics2D g2 = (Graphics2D) g;
    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    // ________________________________________________
    int radius = width/2-width/2*11/12;
    g2.setColor(Color.PINK);
    g.fillArc(100,400,radius*10,radius*9,0,360);
    g2.setColor(Color.WHITE);
    g.fillArc(150,450,radius,radius,0,360);
    g.fillArc(170,450,radius,radius,0,360);
    g2.setColor(Color.BLACK);
    g.fillArc(170,450,radius/2,radius/2,0,360);
    g.fillArc(150,450,radius/2,radius/2,0,360);
    g.drawArc(100,400,radius*10,radius*9,0,360);
    g2.setColor(Color.PINK);
    g.fillPolygon(x,y, 3);
    g2.setColor(Color.BLACK);
    g.drawPolygon(x2,y2, 3);
    g2.setColor(Color.PINK);
    g.fillPolygon(x2,y2, 3);
    g2.setColor(Color.BLACK);
    g.drawPolygon(x,y, 3);
  }
}
