
public class Score{
    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus)
        {
           
            if(gameOver){
                int finalScore = score+(levelCompleted*bonus);
                finalScore += 1000;
                return finalScore;
               
            }else{
                return -1;
            }
        }
}
