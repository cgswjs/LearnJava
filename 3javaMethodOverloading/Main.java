
public class Main
{
    public static void main(String[] args)
    {
        int newScore = calculateScore("Time",500);
        
        int unnamedScore = calculateScore(1000);
        
    }
    /*methods can have the same name but different inputs this is called method overloading*/
    public static int calculateScore(String playerName,int score){
        System.out.println("Player "+playerName+" scored "+score+" points");
        return score*1000; 
    }
    public static int calculateScore(int score){
       System.out.println("Unnamed player scored "+score+" points");
       return score*1000;       
    }
}
