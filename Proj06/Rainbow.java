// Chapter 6 Question 19

// Lawrence Ng

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  private Color skyColor = Color.CYAN;

  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    int xCenter = (int) (0.5 * width);
    int yCenter = (int) (0.75 * height);
 
    // Declare and initialize the radius of the large semicircle:
    int largeRadius = (int) (.25 * width);

    g.setColor(Color.RED);

    // Draw the large semicircle:
    g.fillArc(xCenter - largeRadius, yCenter - largeRadius, largeRadius * 2, largeRadius * 2, 0, 180);

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    int magentaRadius = (int) (.25 * height);
    int greenRadius = (int) (Math.sqrt(largeRadius * magentaRadius));
    
    g.setColor(Color.GREEN);
    g.fillArc(xCenter - greenRadius, yCenter - greenRadius, greenRadius * 2, greenRadius * 2, 0, 180);
    
    g.setColor(Color.MAGENTA);
    g.fillArc(xCenter - magentaRadius, yCenter - magentaRadius, magentaRadius * 2, magentaRadius * 2, 0, 180);

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________

    // Draw the sky-color semicircle:
    // ________________________________________________
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
