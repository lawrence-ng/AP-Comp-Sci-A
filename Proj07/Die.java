/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
    int diceNum;
    public void roll() {
        diceNum = (int)(Math.random() * 6 + 1.0);
    }
    
    public int getNumDots() {
        return diceNum;
    }
    
    //public static void main(String [] args
}
