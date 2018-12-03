
/**
 * A student grade that can be accumulated or subtraced from
 *
 * @author Lawrence Ng
 * @version v. 1.0
 */
public class StudentGrade
{
    private String name;
    private int totalScore;
    private int possibleScore;
    
    /**
     * Constructs a student grade and takes a student name as input
     */
    public StudentGrade(String inputName)
    {
        name = inputName;
    }

    /**
     * add a score to the total grade
     *
     * @param an integer for the score and and integer for the maximum score
     */
    public void accumScore(int score, int maxScore)
    {
        totalScore += score;
        possibleScore += maxScore;
    }
    
    /**
     * remove a score from the total grade
     *
     * @param an integer for the score and and integer for the maximum score
     */
    public void dropScore(int score, int maxScore)
    {
        totalScore -= score;
        possibleScore -= maxScore;
    }
    
    /**
     * calculate the student's grade
     *
     * @return the student's grade
     */
    public int calcGrade()
    {
        return 100* totalScore/possibleScore;
    }
}
