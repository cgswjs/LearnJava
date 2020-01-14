public class Main{
    public static void main(String[] args){
        //you can also do ITelephone ianPhone;
        DeskPhone ianPhone;
        ianPhone = new DeskPhone(40600);
        ianPhone.powerOn();
        ianPhone.callPhone(123456);
        ianPhone.answer();
        
        ianPhone = new MobilePhone(4066007144);
        
    }
}
