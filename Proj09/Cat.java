
/**
 * This class represents a cat pet category
 *
 * @author A. Nguyen
 * @version 1.0
 */
public class Cat extends Pet
{
    // FIELDS
    
    
    // CONSTRUCTORS
    public Cat(String nm, String ownersNm, double price) {
        super(nm, ownersNm, price);
        
    }
    
    // METHODS
    
    public String speak() {
        return "MEOW";
    }
    
    public String getHappy() {
        String action = speak();
        action += " / JUMP UP" + " / KNEAD DOUGH";
        return action;
    } 
}
