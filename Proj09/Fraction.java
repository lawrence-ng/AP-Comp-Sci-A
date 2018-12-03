/**
 * Represents a fraction with an int numerator and int denominator
 * and provides methods for adding and multiplying fractions.
 *
 * @author Lawrence Ng
 */

public class Fraction
{



  private int num;
  private int denom;



  public Fraction()     
  {
    num = 0;
    denom = 1;
  }

  public Fraction(int n)
  {
    num = n;
    denom = 1;
  }

  public Fraction(int n, int d)
  {
    if (d != 0)
    {
      num = n;
      denom = d;
      reduce();
    }
    else
    {
      throw new IllegalArgumentException(
           "Fraction construction error: denominator is 0");
    }
  }

  public Fraction(Fraction other)  
  {
    num = other.num;
    denom = other.denom;
  }



 /**
 * @param fraction
 * @return fraction with added fraction
 */
  public Fraction add(Fraction other)
  {
    int newNum = num * other.denom + denom * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

   /**
 * @param int number
 * @return fraction with number added
 */
  public Fraction add(int m)
  {
    return new Fraction(num + m * denom, denom);
  }
   /**
 * @param fraction
 * @return fraction minus another fraction
 */
  public Fraction subtract(Fraction other)
  {
    int newNum = num * other.denom - denom * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }
   /**
 * @param int number
 * @return fraction minus number
 */
  public Fraction subtract(int m)
  {
    return new Fraction(num - m * denom, denom);
  }
  /**
 * @param fraction
 * @return fraction times anthoer fraction
 */
  public Fraction multiply(Fraction other)
  {
    int newNum = num * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

   /**
 * @param int number
 * @return fraction times number
 */
  public Fraction multiply(int m)
  {
    return new Fraction(num * m, denom);
  } 
  /**
 * @param fraction
 * @return fraction divided by another fraction
 */
  public Fraction divide(Fraction other)
  {
    int newNum = num / other.num;
    int newDenom = denom / other.denom;
    return new Fraction(newNum, newDenom);
  }

   /**
 * @param int number    
 * @return fraction divided by number
 */
  public Fraction divide(int m)
  {
    return new Fraction(num / m, denom);
  }

   /**
 * @param none
 * @return double of the fraction
 */
  public double getValue()
  {
    return (double)num / (double)denom;
  }

   /**
 * @param none
 * @return String of the fraction
 */
  public String toString()
  {
      if(num>0&&denom<0){
          num *= -1;
          denom *= -1;
        }
    return num + "/" + denom;
  }



   /**
 * @param none
 * @return none
 */
  private void reduce()
  {
    if (num == 0)
    {
      denom = 1;
      return;
    }

    if (denom < 0)
    {
      num = -num;
      denom = -denom;
    }

    int q = gcf(Math.abs(num), denom);
    num /= q;
    denom /= q;
  }

   /**
 * @param int number, int denominator
 * @return int greatest common factor
 */
  private int gcf(int n, int d)
  {
    if (n <= 0 || d <= 0)
    {
      throw new IllegalArgumentException(
                  "gcf precondition failed: " + n + ", " + d);
    }

    if (n % d == 0)
      return d;
    else if (d % n == 0)
      return n;
    else
      return gcf(n % d, d % n);
  }
}
