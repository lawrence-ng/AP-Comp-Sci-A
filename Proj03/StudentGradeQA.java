/**
   A class to test the StudentGrade class.
*/
public class StudentGradeQA
{
   /**
      Tests the methods of the StudentGrade class.
      @param args not used
   */
   public static void main(String[] args)
   {
      StudentGrade katsGrade = new StudentGrade("Kat");
      katsGrade.accumScore(20, 21);
      katsGrade.accumScore(41, 45);      
      katsGrade.accumScore(38, 40);
      
      System.out.println("Grade = " + katsGrade.calcGrade() +
                         "... expected 93");
      katsGrade.accumScore(13, 30);      
      katsGrade.accumScore(45, 52);
      katsGrade.dropScore(13, 30);   
      System.out.println("Grade = " + katsGrade.calcGrade() +
                         "... expected 91");
                        }
}
