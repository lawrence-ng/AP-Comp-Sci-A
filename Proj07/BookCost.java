// Chapter 7 Question 13

import java.util.Scanner;

public class BookCost
{
  /**
   *  calculate total book order cost
   */
  public static double getOrderTotal(int bp, int nb)
  {
      if (bp + nb >= 12)
        return (bp + nb) * 14.0;
      else if (bp + nb >= 3)
        return (bp + nb) * 15.95;
      else if (bp + nb == 2)
        return 37.95;
      else if (bp == 1)
        return 18.95;
      else
        return 21.95;
  }

  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);

    System.out.print("Enter the amount of bp: ");
    int bp = kb.nextInt();
    System.out.print("Enter the amount of nb: ");
    int nb = kb.nextInt();

    System.out.println();  // blank line

    System.out.println("total cost: " + getOrderTotal(bp, nb));
    kb.close();
  }
}

