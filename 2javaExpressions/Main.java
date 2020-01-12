public class Main
{
    
    public static void main(String[] args)
    {
        /*This creates a new instance of Score class and allows user to call a method inside that class*/
        Score calculateScore = new Score();
        /*Calling a method calculateScore inside the Score class*/
        int finalScore = Score.calculateScore(true,800,5,100);
        System.out.println("Your final score is "+finalScore);
    }
    
    /*Create a method*/
    
    
  
}
