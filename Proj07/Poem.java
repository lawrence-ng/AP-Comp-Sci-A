import java.util.Scanner;
/**
 * @author Lawrence Ng
 */
public class Poem
{
    public static void main(String[] args){
        boolean running = true;
        while (true) {
            Scanner kboard = new Scanner(System.in);
            System.out.print("Enter your number: ");
            int number = kboard.nextInt();
            if (number == 1 || number == 2) System.out.println("One, two, buckle your shoe");
            else if (number == 3 || number == 4) System.out.println("Three, four, open the door");
            else if (number == 5 || number == 6) System.out.println("Five, six, pick up sticks");
            else if (number == 7 || number == 8) System.out.println("Seven, eight, lay them straight");
            else if (number == 9 || number == 10) System.out.println("Nine, ten, do it again!");
            else {running = false;
            kboard.close();}
        }
            
    }
}
