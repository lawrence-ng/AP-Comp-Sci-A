
import java.awt.*;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.lang.*;
import java.util.Random;

public class Clouds extends Head
{
    private Color sunColor = new Color(252, 251, 50);
    private int degrees;
     private int width;    
   private int height;
   private Random r = new Random();
    public Clouds(int w,int h,int d){
        super(w,h);
        degrees = d;
          width = w;
      height = h;
    }
    @Override
    public void draw(Graphics g)
  {
      
      Graphics2D g2 = (Graphics2D) g;
      
    int radius = width/2-width/2*11/12;
    
    g2.setColor(Color.GRAY);
    for(int i = 0; i < 10; i++){
    g2.fillArc(r.nextInt(width+1),50,radius*8,radius*8,0,360);
}
    
    
  } 
}
