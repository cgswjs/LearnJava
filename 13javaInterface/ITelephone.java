//interface defines behaviors 
//one class can only extends one parent class
//one class can implements as many interfaces as you want
public interface ITelephone
{
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
   
}
