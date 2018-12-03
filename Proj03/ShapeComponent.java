import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.BasicStroke;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class ShapeComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      // Draw green rect
      g2.setColor(Color.GREEN);
      g2.fill(new Rectangle(0, 0, 480, 340));
      //draw cyan rect
      g2.setColor(Color.cyan);
      g2.fill(new Rectangle(0, 0, 480, 170));
      //draw gray rect
      g2.setColor(Color.gray);
      Rectangle rect1 = new Rectangle(20, 290, 440, 50);
      g2.fill(rect1);
      //draw 2 light gray rects
      g2.setColor(Color.LIGHT_GRAY);
      g2.fill(new Rectangle(30, 50, 40, 240));
      g2.fill(new Rectangle(410, 50, 40, 240));
      //draw gray triangle
      int[] xCoords = {30, 250, 450};
      int[] yCoords = {50, 0, 50};
      Polygon aPoly = new Polygon(xCoords, yCoords, 3);
      g2.setColor(Color.gray);
      g2.fill(aPoly);
      //draw red oval
      g2.setColor(Color.red);
      g2.fill(new Ellipse2D.Double(225, 20, 50, 25));
      //draw blue line
      Line2D.Double aLine = new Line2D.Double(50, 320, 430, 320);
      g2.setColor(Color.blue);
      g2.draw(aLine);
      //draw colored rect
      rect1.grow(-10, -10);
      rect1.translate(0, 5);
      g2.setColor(new Color(0, 50, 50));
      g2.draw(rect1);
      //draw black text
      g2.setColor(Color.BLACK);
      g2.drawString("MDCCLXXVI", 215, 303);
      
   }
}
