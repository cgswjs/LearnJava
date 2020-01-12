public class Account{
 private String number;
 private double balance;
 private String customerName;
 private String customerEmailAddress;
 private String customerPhoneNumber;
    
 public void setUser(String number,String customerName,String customerEmailAddress, String customerPhoneNumber){
     this.number = number;
     this.customerName = customerName;
     this.customerEmailAddress = customerEmailAddress;
     this.customerPhoneNumber = customerPhoneNumber;   
     System.out.println("Current user is "+customerName+" and account number is "+number);
 }
 
 public void deposit(double depositTotal){
     
       this.balance += depositTotal; 
       System.out.println("You just deposited "+this.balance);
    
}

public void withdraw(double withdrawTotal){
    if(this.balance <withdrawTotal){
        System.out.println("This account is not sufficient");
        
    }else{
        this.balance -= withdrawTotal;
        System.out.println("You just withdrew "+this.balance);
    }
}
    
}