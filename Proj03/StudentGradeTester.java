
/**
 * Create a student grade, add and drop scores, and print the resulting grade
 *
 * @author Lawrence Ng
 * @version v. 1.0
 */
public class StudentGradeTester
{
    public static void main(String[] args)
    {
        StudentGrade grade = new StudentGrade("Alex");
        grade.accumScore(67, 100);
        grade.accumScore(98, 100);
        grade.dropScore(67, 100);
        System.out.println(grade.calcGrade() + "%\nexpected: 98%");
    }
}
