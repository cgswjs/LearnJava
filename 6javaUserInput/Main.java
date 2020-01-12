import java.util.Scanner;
import javax.swing.*;
public class Main
{
    
    public static void main(String[] args)
    {
        /*create a new scanner instance*/
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();/*handle next line character*/
        
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();/*handle next input int*/
        scanner.nextLine();
        
        System.out.println("Your name is "+name+" and your age is "+age);
        /*close the scanner*/
        scanner.close();
        
        /*Use JOptionPane to gather and show user input*/
        String userName = JOptionPane.showInputDialog(null,"Enter your name: ");
        System.out.println("User name is "+userName);
        JOptionPane.showMessageDialog(null,"User name is "+userName);
    }

}
