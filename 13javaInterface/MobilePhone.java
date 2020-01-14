public class MobilePhone implements ITelephone{
    
    private long myNumber;
    private boolean isRinging;
    private boolean isOn = false;
    //constructor
    public MobilePhone(long myNumber){
        this.myNumber = myNumber;
    }
    
    @Override
    public void powerOn(){
        boolean isOn = true;
        System.out.println("Mobile phone powred up!");
        
    }
    
    @Override
    public void dial(int phoneNumber){
        if(isOn){
            
            System.out.println("Now ringing "+phoneNumber+" on mobile phone");
        }else{
            System.out.println("Phone is switched off");
        }
    }
    
    @Override
    public void answer(){
        if(isRinging){
            System.out.println("Answering the mobile phone");
        }
    }
    
    @Override
    public boolean callPhone(int phoneNumber){
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody ring ring");
            
        }else{
            isRinging = false;
        }
        return isRinging;
    }
    
    @Override
    public boolean isRinging(){
        return isRinging;
    }
    
    
    
}