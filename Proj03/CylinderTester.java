
/**
 * Creates a cylinder and prints its volume and surface area
 *
 * @author Lawrence Ng
 * @version v. 1.0
 */
public class CylinderTester
{
    public static void main(String[] args)
    {
        Cylinder cylinder = new Cylinder(4, 10);
        System.out.println(cylinder.getVolume() + "\nexpected: 502.65");
        System.out.println(cylinder.getSurfArea() + "\nexpected: 351.86");
    }
}
