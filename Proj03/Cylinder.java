
/**
 * A cylinder that has a base and a height and can return a volume and a surface area
 *
 * @author Lawrence Ng
 * @version v. 1.0
 */
public class Cylinder
{
    private Circle base;
    private double height;

    /**
     * Constructs a cylinder, taking a radius and a height as inputs.
     */
    public Cylinder(double radius, double inputHeight)
    {
        base = new Circle(radius);
        height = inputHeight;
    }

    /**
     * Get the volume of the cylinder
     *
     * @return    the product of the base and the height
     */
    public double getVolume()
    {
        return base.getArea() * height;
    }
    
    /**
     * Get the surface area of the cylinder
     *
     * @return    the sum of the product of the circumference of the base and the height and 2 times the area of the base
     */
    public double getSurfArea()
    {
        return base.getCircumf() * height + 2 * base.getArea();
    }
}
