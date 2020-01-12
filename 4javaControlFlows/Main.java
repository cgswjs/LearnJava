
public class Main
{
    
    public static void main(String[] args)
    {
        int switchValue = 5;
        switch(switchValue){
            case 1:
                System.out.println("switchValue is 1");
                break;
            case 2:
                System.out.println("switchValue is 2");
                break;
            case 3:case 4:case 5:
                System.out.println("switchValue is "+switchValue);
                break;
            default:
                System.out.println("switchValue can't be identified");
                break;
            
            
        }
        /*For loop*/
        int x=0;
        for(int i=0; i<10; i++){
            x++;
            System.out.println("x = "+ x);
            
        }
        
        /*while*/
        int count1 = 1;
        while(count1 != 6){
            System.out.println("Count1 value is "+count1);
            count1++;   
        }
        
        /*Do while*/
        int count2 = 6;
        do{
            System.out.println("Count2 value is "+count2);
            count2++;
        }while(count2 <7);
        
    }

}
