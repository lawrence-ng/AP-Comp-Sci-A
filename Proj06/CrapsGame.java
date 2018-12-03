// Implements the game of Craps logic

public class CrapsGame
{
  private int point;

  public CrapsGame(){
    

  }
  public int processRoll(int total)
  {
      if(point == 0){
          if(total == 7 || total == 11){
            point = 0;
            return 1;
          }else if(total == 2 || total == 3 || total == 12){
            point = 0;
            return -1;
          }else{
            point = total;
            return 0;
          } 
      }else{
            if(total == point){
                point = 0;
                return 1;
            }else if(total == 7){
                point = 0;
                return -1;
            }else{
                return 0;
            }
      }
  }

  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}

