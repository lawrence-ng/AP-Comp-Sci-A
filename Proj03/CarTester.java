import java.awt.Color;
import java.util.Random;
/**
 * Write a description of class CarTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarTester
{
    public static void main(String[] args)
    {
        Car car = new Car("Volkswagen", "Volkswagen Type 1", 1938, Color.BLACK, 35);
        System.out.println("make: " + car.getMake() + "\nmodel: " + car.getModel() + "\nyear: " + car.getYear() + "\ncolor: " + car.getColor() + "\nspeed: " + car.getSpeed());
        Random rng = new Random();
        for(int i = 0; i < 10; i++)
        {
            int speedup = rng.nextInt(5) + 1;
            car.speedUp(speedup);
            System.out.println("sped up by: " + speedup + "\nnew speed: " + car.getSpeed());
            int slowdown = rng.nextInt(5) + 1;
            car.slowDown(slowdown);
            System.out.println("slowed down by: " + slowdown + "\nnew speed: " + car.getSpeed());
        }
    }
}
