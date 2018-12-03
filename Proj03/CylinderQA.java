/**
 * This is to test Cylinder class, which also uses Circle class
 * @author Anh Nguyen
 * @version 1.0
 */

import java.util.Scanner;

public class CylinderQA
{
  public static void main(String[] args)
  {
    double r = Math.random()*20+1;
    double h = Math.random()*50+1;
    double eVolume = Math.PI * r * r * h;
    double eArea = Math.PI * 2 * r * h + Math.PI * r * r * 2;

    Cylinder cyl = new Cylinder(r, h);
    double volume = cyl.getVolume();
    double surfArea = cyl.getSurfArea();
    System.out.printf("volume = %,9.2f  ... expected %,9.2f\n", volume, eVolume);
    System.out.printf("surface area = %,9.2f  ... expected %,9.2f\n", surfArea, eArea);
   
  }
}
