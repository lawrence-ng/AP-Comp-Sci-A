
/**
 * This is for testing Cat and Dog, calling ALL methods in the classes.
 *
 * @author A. Nguyen
 * @version 1.0
 */

import java.awt.Color;
public class HouseOfPets
{
    public static void main(String[] args) {
        Cat cat1 = new Cat("Garfield", "Jim Davis", 5.0);
        System.out.println(cat1);
        System.out.println(cat1.speak());
        System.out.println(cat1.getHappy());
        
        Dog dog1 = new Dog("Snoopy", "Charlie Brown", 25.0, Color.BLACK);
        System.out.println(dog1);
        System.out.println(dog1.speak());
        System.out.println(dog1.getHappy());
    }
}
