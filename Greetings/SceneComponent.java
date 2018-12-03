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
public class SceneComponent extends JComponent
{  

      
    public SceneComponent(){
        
    }
   public void paintComponent(Graphics g)
   {
       
       Graphics2D g2 = (Graphics2D) g;
       Sky sky = new Sky(480,600);
       sky.draw(g2);
       Body body = new Body(480,600);
       body.draw(g2);
       Head head = new Head(480,600);
       head.draw(g2);
       Clouds sun = new Clouds(480,300,180);
       sun.draw(g2);
   }
}