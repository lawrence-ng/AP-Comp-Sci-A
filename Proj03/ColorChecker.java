import java.awt.Color;

public class ColorChecker
{
    public static void main(String [] args) {
    Color myColor = new Color(100, 80, 160);
    Color myColor2 = myColor.brighter();
    System.out.println("original: " + myColor + "\nbrighter: " + myColor2);
    /* After seeing the printed values, you can conclude that brighter method
     * increases the RGB values of the color.
     */
}
}