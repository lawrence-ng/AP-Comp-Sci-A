

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Body extends JPanel
{
  // Declare skyColor:
  // ________________________________________________
  Color skyColor = new Color(135,206,250);
  Color brown = new Color(139,69,19);
   private int width;    
   private int height;
  public Body(int w, int h)
  {
      width = w;
      height = h;
}

  // Draws the rainbow.
  public void draw(Graphics g)
  {
    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    // ________________________________________________
    int xCenter = width/2;
    int yCenter = height;
    // Declare and initialize the radius of the large semicircle:
    // ________________________________________________
    int radius = width;
    
    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    // ________________________________________________
    g.setColor(Color.PINK);
    g.fillArc(radius/24,yCenter-radius/2+radius/24,radius*11/12,radius*11/12,0,180);
    g.setColor(Color.BLACK);
    g.drawArc(radius/24,yCenter-radius/2+radius/24,radius*11/12,radius*11/12,0,180);
    
    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________

    // Draw the sky-color semicircle:
    // ________________________________________________
    
  }

}
