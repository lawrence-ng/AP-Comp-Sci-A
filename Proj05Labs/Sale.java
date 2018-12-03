
/**
 * Write a description of class Sale here.
 *
 * @author Lawrence Ng
 * @version v. 1.0
 */
public class Sale
{
    private String itemName;
    private int itemCount;
    private double itemPrice;
    
    /**
     * Constructs a sale with a given name, count and price
     * @param the name, count, and price
     */
    public Sale(String initName, int initCount, double initPrice)
    {
        itemName = initName;
        itemCount = initCount;
        itemPrice = initPrice;
    }
    
    /**
     * Get the name of the item
     * @return the item name
     */
    public String getItemName()
    {
        return itemName;
    } 
    
    /**
     * Get the count of the item
     */
}
