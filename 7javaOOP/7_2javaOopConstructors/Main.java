
public class Main
{
   
    public static void main(String[] args)
    {
        Account user1 = new Account();
        String number = "00001";
        String name = "Yihan Chen";
        String email = "1@gmail.com";
        String phone = "4066007144";
        double deposit = 2000.5;
        
        user1.setUser(number,name,email,phone);
        user1.deposit(deposit);
       
    }

}
