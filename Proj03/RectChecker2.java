import java.awt.Rectangle; 

public class RectChecker2
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(150, 120, 80, 60);
        box.translate((int)box.getWidth(), (int)box.getHeight());
        System.out.println("(" + box.getX() + ", " + box.getY() + ")");
        System.out.println("expected: 25, 40");
    }
}
