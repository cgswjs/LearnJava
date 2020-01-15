import java.util.ArrayList;
//example of generic class T
//extends makes java be able to use any type from Player
//one can only extend one class, otherwise interface must be used to enable multiple inheritance
public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    
    private ArrayList<T> members = new ArrayList<>();
    
    public Team(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean addPlayer(T player){
        if(members.contains(player)){
            //1. since we changed type to T, we need to cast player to type Player so that the compliler knows there is a getname() method from Player class
            //2. the right way is to use T extends Player in the ArrayList definition
            System.out.println(player.getName()+" is already on this team");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName()+" picked for team "+this.name);
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();
    }
    public void matchResult(Team opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            won++;
            message = " beat ";
            
        }else if(ourScore == theirScore){
            tied++;
            message = " drew with ";
            
        }else{
            message = " lost to ";
            lost++;
            
        }
        played++;
        if(opponent !=null){
            //use this to get our team name and opponent.getName() to get opponent team name
            System.out.println(this.getName()+message+opponent.getName());
            opponent.matchResult(null,theirScore, ourScore);
        
        }
    }
    public int ranking(){
        return won*2+tied;
    }
    
    //pre-built interface Comparable
    @Override
    public int compareTo(Team<T> team){
        if(this.ranking()>team.ranking()){
            System.out.println(this.getName()+"'s rank is higher than "+team.getName());
            return 1;
            
        }else if(this.ranking()<team.ranking()){
            System.out.println(this.getName()+"'s rank is lower than "+team.getName());
            return -1;
        }else{
             System.out.println(this.getName()+"'s rank is tied with "+team.getName());
             return 0;
        }
        
    }
}