import java.util.Scanner;
public class Main
{
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args)
    {
        
        // //create a instance of class Gearbox
        // Gearbox mcLaren = new Gearbox(6);
        // //create a instance of inner class Gear
        // //---This method can only work if we put Gear class as public---//
        // // Gearbox.Gear first = mcLaren.new Gear(1,12.3);
        // // //create another instance of inner class Gear
        // // Gearbox.Gear thrid = mcLaren.new Gear(1,20.5);
        // //-------------------------------------------------------------//
        // mcLaren.addGear(1, 5.3);
        // mcLaren.addGear(2,10.6);
        // mcLaren.addGear(3,15);
        // //put Clutch in
        // mcLaren.operateClutch(true);
        // //change gear
        // mcLaren.changeGear(1);
        // //pub Clutch out
        // mcLaren.operateClutch(false);
        // System.out.println("The wheel speed is currently at is "+mcLaren.wheelSpeed(1000)+" RPM");
        // mcLaren.changeGear(2);
        // System.out.println("The wheel speed is currently at is "+mcLaren.wheelSpeed(1000)+" RPM");
        
        
        //Example of local class
        class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I've been attached");
                
            }
            @Override
            public void onClick(String title){
                System.out.println(title+" was clicked");
            }
        }
        
        btnPrint.setOnClickListener(new ClickListener());
        listen();
        
        
    }
    
    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                
                
                
            }
            
        }
    }
      
}