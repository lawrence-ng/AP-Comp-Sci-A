
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pet
{
    private String name;
    private String ownersName;
    private double purchasePrice;

    /**
     * Constructor for objects of class Pet
     */
    public Pet(String nm, String ownersNm, double price)
    {
        name = nm;
        ownersName = ownersNm;
        purchasePrice = price;

    }
    
    public String toString() {
        return name + ", " + ownersName;
    }

}
