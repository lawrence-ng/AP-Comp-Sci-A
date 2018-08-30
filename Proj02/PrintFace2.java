import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class PrintFace2 extends JFrame implements ActionListener, KeyListener
{
  int numSpaces;
  
  public PrintFace2() {
      addKeyListener(this);
      System.out.println("Key Listener added");
   }
    
  public static void main(String[] args) {
        System.out.println("   xxxxx   \n  x     x  \n((  o o  ))\n  |  V  |  \n  | === |  \n   _____\n");
        //JFrame frame = new JFrame();
        //frame.addKeyListener(frame);
        PrintFace2 printface = new PrintFace2();
    }
    
  public void keyTyped(KeyEvent e) {
        
        System.out.println("Key event!");
        
        if(e.getKeyCode() == 65) {
            numSpaces -=1;
            System.out.println(numSpaces + "   xxxxx   \n  x     x  \n((  o o  ))\n  |  V  |  \n  | === |  \n   _____\n");
        }
        
        if(e.getKeyCode() == 68) {
            numSpaces +=1;
            System.out.println(numSpaces + "   xxxxx   \n  x     x  \n((  o o  ))\n  |  V  |  \n  | === |  \n   _____\n");
        }
        
    }
    
  public void keyPressed(KeyEvent e) {
        
    }
    
  public void keyReleased(KeyEvent e) {
        
    }
    
  public void actionPerformed(ActionEvent e) {
        
    }


}
