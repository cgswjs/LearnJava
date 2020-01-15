import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        
        //now one can add a class type FootballPlayer to specify the added team member
        //Since pat and beckhan are not from FootballPlayer, they won'be able to be added
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Cros");
        adelaideCrows.addPlayer(joe);
        // adelaideCrows.addPlayer(pat);
        // adelaideCrows.addPlayer(beckham);
        
        
        Team<BaseballPlayer> baseballTeam = new Team<>("CHicago Cubs");
        baseballTeam.addPlayer(pat);
        
        Team<SoccerPlayer> arsenalTeam = new Team<>("Arsenal");
        arsenalTeam.addPlayer(beckham);
        
        Team<SoccerPlayer> kingTeam = new Team<>("King");
        SoccerPlayer runy = new SoccerPlayer("Ruby");
        
        arsenalTeam.matchResult(kingTeam, 1, 0);
        
        System.out.println(arsenalTeam.getName()+" has a ranking of : "+arsenalTeam.ranking());
       
        arsenalTeam.compareTo(kingTeam);
        
        
    }
}