
/**
 * Write a description of class MathCalculations here.
 *
 * @author Lawrence Ng
 * @version (a version number or a date)
 */
public class MathCalculations
{
    public static int cToFDeg(int celsius)
    {
        return (int) Math.round(9.0 * celsius / 5.0 + 32.0);
    }
    
    public static double distanceFormula(double x1, double y1, double x2, double y2)
    {
        return (double) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
    
    public static double volOfSphere(double radius)
    {
        return (double) 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static double approxE(int n)
    {
        return (double) Math.pow(1.0 + 1.0 / n, n);
    }
    
    public static String timeConverter(int secs)
    {
        int hrs = secs / 3600;
        int mins = secs % 3600 /60;
        int secs2 = secs % 3600 % 60;
        return "" + hrs + ":" + mins + ":" + secs2;
    }
}
