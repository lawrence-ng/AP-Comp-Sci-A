
/**
 * Write a description of class Conversation2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Conversation2
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in); // Create keyboard object to get input from user
    
    System.out.print("What is your name? "); // Ask user
    String name = kboard.nextLine();         // Accept answer from user
    
    System.out.print("\nWhat is your quest? "); // Ask user
    String quest = kboard.nextLine();              // Accept answer from user    
        
    System.out.print("\nWhat is your favorite color? "); // Ask user
    String color = kboard.nextLine(); // Accept answer from user
    
    System.out.print("\nSo your name is " + name +", your quest is " + quest + ", and your favorite color is " + color + ".\n\nOff you go!");
        
    kboard.close(); // Done using the keyboard
  }
}
