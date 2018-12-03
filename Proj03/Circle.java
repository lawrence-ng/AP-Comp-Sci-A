
/**
 * A circle that has a radius and can return its area and circumference
 *
 * @author Lawrence Ng
 * @version v. 1.0
 */
public class Circle
{
    private double radius;

    /**
     * Constructs a circle, taking a radius as input
     */
    public Circle(double inputRadius)
    {
        radius = inputRadius;
    }

    /**
     * Get the circle's area
     *
     * @return    Pi multiplied by the square of the radius
     */
    public double getArea()
    {
        return radius * radius * Math.PI;
    }
    
    /**
     * Get the circle's circumference
     * @return    the radius multiplied by 2 pi
     */
    public double getCircumf()
    {
        return 2 * Math.PI * radius;
    }
}
