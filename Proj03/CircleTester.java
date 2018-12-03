
/**
 * Creates a circle and prints its area and circumference
 *
 * @author Lawrence Ng
 * @version v. 1.0
 */
public class CircleTester
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(4);
        System.out.println(circle.getArea() + "\nexpected: 50.27");
        System.out.println(circle.getCircumf() + "\nexpected: 25.13");
    }
}
