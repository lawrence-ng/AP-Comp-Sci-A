
/**
 * This class represents a dog pet category
 *
 * @author A. Nguyen
 * @version 1.0
 */

import java.awt.Color;
public class Dog extends Pet
{
    // FIELDS

    private Color leashColor;
    
    // CONSTRUCTORS
    public Dog(String nm, String ownersNm, double price, Color lColor) {
        super(nm, ownersNm, price);
        leashColor = lColor;
    }
    
    // METHODS
    
    public String speak() {
        return "WOOF";
    }
    
    public String getHappy() {
        return speak() + " / JUMP UP";
    }      
    
    public Color getLColor() {
        return leashColor;
    }
    
}
