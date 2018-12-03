import java.awt.Color;
/**
 * A Car
 *
 * @author Lawrence Ng
 * @version v. 1.0
 */
public class Car
{
    private String make;
    private String model;
    private int year;
    private Color color;
    private int speed;
    
    /**
     * Constructs a car without specified details
     */
    public Car()
    {
        
    }
    
    /**
     * Constructs a car with details
     */
    public Car(String inputMake, String inputModel, int inputYear, Color inputColor, int inputSpeed)
    {
        make = inputMake;
        model = inputModel;
        year = inputYear;
        color = inputColor;
        speed = inputSpeed;
    }

    /**
     * Get the make
     * @return    make
     */
    public String getMake()
    {
        return make;
    }
    
    /**
     * Get the model
     * @return    model
     */
    public String getModel()
    {
        return model;
    }
    
    /**
     * Get the year
     * @return    year
     */
    public int getYear()
    {
        return year;
    }
    
    /**
     * Get the color
     * @return    color
     */
    public Color getColor()
    {
        return color;
    }
    
    /**
     * Get the speed
     * @return    speed
     */
    public int getSpeed()
    {
        return speed;
    }
    
    /**
     * Add to the speed
     */
    public void speedUp(int miles)
    {
        speed += miles;
    }
    
    /**
     * Subtract from the speed
     */
    public void slowDown(int miles)
    {
        speed -= miles;
    }
}
