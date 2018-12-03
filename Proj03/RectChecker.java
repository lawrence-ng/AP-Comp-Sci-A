import java.awt.Rectangle; 

public class RectChecker
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        
        double area = box.getHeight() * box.getWidth();
        System.out.println("Area: " + area + "\nExpected: 600");
    }
}
