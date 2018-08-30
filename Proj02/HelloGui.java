/**
 *  This program displays a message in a window.
 */

import java.awt.*;
import javax.swing.*;

public class HelloGui extends JFrame
{
  
    
  public HelloGui()   // Constructor
  {
    super("GUI Window");    // Set the title bar
    Container c = getContentPane();
    c.setBackground(Color.RED);
    c.setLayout(new FlowLayout());
    c.add(new JTextField("GUI Hello, all Cal High students!", 20));
  }

  public static void main(String[] args)
  {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    short screenHeight = (short) Math.round(screenSize.getHeight());
    short windowHeight = 100;
      
    HelloGui window = new HelloGui();

    // Set this window's location and size:
    // upper-left corner at 300, 300; width 200, height 100
    window.setBounds(0, screenHeight - windowHeight , 400, windowHeight);

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}
