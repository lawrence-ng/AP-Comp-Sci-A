
/**
 * Write a description of class Bodyneck here.
 *
 * @author Lawrence Ng
 * @version v. 1.0
 */
import java.awt.*;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bodyneck extends JPanel
{
    private int width;    
   private int height;
  public Bodyneck(int w, int h)
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
    int xCenter = width/2;
    int yCenter = height;
    // Declare and initialize the radius of the large semicircle:
    // ________________________________________________
    int radius = width;
    g.setColor(Color.GRAY);
    
    // Draw the large semicircle:
    g.fillArc(radius/4,yCenter-radius/2+radius/4,radius/2,radius/2,0,360);

    
    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    // ________________________________________________
    g2.setColor(Color.RED);
    Rectangle box = new Rectangle( xCenter-xCenter/24, height*5/8,xCenter-xCenter*11/12,height/4);
    g2.draw(box);
    g2.fill(box);
  }
}
