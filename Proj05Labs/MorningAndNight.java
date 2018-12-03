
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MorningAndNight extends JFrame implements ActionListener
{
    private EasySound rooster;
    private boolean morning;
    private EasySound cow;

  /**
   *   Constructor
   */
  public MorningAndNight()
  {
    super("Morning");
    morning = true;
    rooster = new EasySound("roost.wav");
    rooster.play();
    
    cow = new EasySound("cow-moo1.wav");
    cow.play();

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
  }

  public static void main(String[] args)
  {
    MorningSounds morning = new MorningSounds();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
    
    Timer t = new Timer(1000, morning);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (morning) {
        Container c = getContentPane();
        c.setBackground(Color.WHITE);
        rooster.play();
    }
    else {
        Container c = getContentPane();
        c.setBackground(Color.BLACK);
        cow.play();
    }
    morning = !morning;
  }
}
