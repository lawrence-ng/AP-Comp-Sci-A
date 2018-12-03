
/**
 * @author Lawrence Ng
 * @version v. 1.0
 */
public class UsingLoops
{
    /**
     * @param int initial year, double initial population, final population, double rate of the population growth
     * @return int final year
     */
    public static int popGrowth(int initYear, double initPop, double finalPop, double growthRate){
        int year = initYear;
        double currentPop = initPop;
        while(currentPop < finalPop){
            currentPop = currentPop*(1.0 + growthRate);
            year += 1;
        }
        
        return year;
    }
    
    /**
     * @param int number between 0 and n
     * @return int sum of the multiples of 3 in between 0 and n
     */
    public static int addMultOf3(int n){
        int sum = 0;
        int currentN = 0;
        while(currentN<n){
            sum += currentN;
            currentN +=3;
            
        }
        return sum;
    }
    
    /**
     * @param int row number initial, int number of seats in the initial row, int added amount of seats for each increase in rows, int row final
     * @return number of seats in row final
     */
    public static int calcChairs(int rowNum1, int count1, int countIncrement, int rowNum2){
        int count2 = count1;
        int row = rowNum1;
        while(row < rowNum2){
            count2 += countIncrement;
            row++;
        }
        return count2;
    }
    
    /**
     * @param double rate learning, double desired progression
     * @return double months needed to reach desired knowledge
     */
    public static double knowledgeGrowth(double rate, double desiredKnowledge){
        double sum = 0.0;
        double percent = 1;
        double r = rate;
        double months = 0;
        while(sum < desiredKnowledge){
            sum+=r;
            percent -= r;
            r *= percent;
            months++;
        }
        return months;
    }
    
    /**
     * @param int number of terms used to find pi
     * @return double estimate of pi
     */
    public static double estPi(int n){
        double pi = 0;
        boolean minus = false;
        double denominator = 1;
        for(int i = 1; i <= n; i++){
            if(minus){
                pi -= 4/denominator;
            }else{
                pi += 4/denominator;
            }
            denominator += 2;
            minus = !minus;
        }
        return pi;
    }
    
    /**
     * @param int number of rows
     */
    public static void starTriangle(int n){
        
        for(int i = 1; i <= n; i++){
            String line = "";
            for(int x = n - i; x >= 1; x -= 1){
                line +=" ";
            }
            for(int y = 1; y <= i * 2 - 1; y += 1){
                line +="X";
            }
            System.out.println(line);
        }
    }
    
    /**
     * @param int row/column length
     */
    public static void identMatrix(int n){
        int lineC = 1;
        do{
            if(n == 0){
                break;
            }
            String line = "";
            for(int i = 1;i <= n; i++){
                line += "0";
                
            }
            char[] c = line.toCharArray();
            c[lineC - 1] = '1';
            line = new String(c);
            lineC++;
            System.out.println(line);
        }while(lineC <= n);
    }
}
