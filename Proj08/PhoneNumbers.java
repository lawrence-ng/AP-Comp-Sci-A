
/**
 * Write a description of class PhoneNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhoneNumbers
{
   public static void main(String[] args)
   {
       cleanNumber("444.999.1234");
   }
    
   public static String cleanNumber(String phoneNumber)
   {   
      System.out.println(phoneNumber);
      System.out.println(phoneNumber.length());
      String string = "";
      for (int i = 0; i < phoneNumber.length() - 1; i++)
      {
         char ch = phoneNumber.charAt(i);
         System.out.println(ch);
         if (Character.isDigit(ch))
         {
            string += ch;
         }          
      }
      System.out.println(string);
      if(string.length() != 10)
      {
         return "Error";
      }
      else
      {
         return "1";
      }
   }   
}
