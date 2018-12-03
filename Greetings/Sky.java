
import java.awt.*;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.*;
public class Sky extends JPanel
{
     private int width;    
   private int height;
   private final int numSnowFlakes = 100;
   private Random r = new Random();
    public Sky(int w , int h){
        width = w;
      height = h;
    }
    public void draw(Graphics g)
  {
       Graphics2D g2 = (Graphics2D) g;
    Rectangle background = new Rectangle(width,height);
    g.setColor(new Color(60, 100, 200));
    g2.draw(background); 
    g2.fill(background);
    for(int i = 0;i<numSnowFlakes;i++){
        Rectangle star = new Rectangle(r.nextInt(width+1),r.nextInt(height+1),5,5);
        g.setColor(Color.WHITE);
        g2.draw(star); 
    }
  }

    
}
