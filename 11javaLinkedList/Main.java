import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Main{
        public static void main(String[] args){
            //address for each byte = 1byte/8bits
            //~ each short = 2bytes/16bits
            //~ each int = 4bytes/32bits
            //~ each long = 8bytes/64bits
            //~ each float = 4bytes/32bits
            //~ each double = 8bytes/64bits
            LinkedList<String> placesToVisit = new LinkedList<String>();
            addInOrder(placesToVisit,"Bozeman");
            addInOrder(placesToVisit,"Las Vegas");
            addInOrder(placesToVisit,"Seattle");
            addInOrder(placesToVisit,"New York");
            addInOrder(placesToVisit,"Los Angeles");
            addInOrder(placesToVisit,"Austin");
            addInOrder(placesToVisit,"Chicago");
            
            printList(placesToVisit);
            visit(placesToVisit);
            
            
            }
        private static void printList(LinkedList<String> linkedList){
            Iterator<String> i = linkedList.iterator();
            //loop over the linked list while next value is not null
            while(i.hasNext()){
                System.out.println("Now visiting "+i.next());
            }
            System.out.println("============================");
        }
        private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
            ListIterator<String> stringListIterator = linkedList.listIterator();
            while(stringListIterator.hasNext()){
                int comparison = stringListIterator.next().compareTo(newCity);
                if(comparison ==0){
                    System.out.println(newCity+" is already included as a destination");
                    return false;
                }else if(comparison >0){
                    stringListIterator.previous();
                    stringListIterator.add(newCity);
                    return true;
                }else{
                    //do nothing if next city is alphabetically smaller than inserted newCity
                    //So the while loop will keep on going and the newCity will be inserted later
                }
            }
            //when while loop breaks, it means next location is null so the newCity should just be added to the end of the list
            stringListIterator.add(newCity);
            return true;
            
        }
        private static void visit(LinkedList cities){
            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            boolean goingForward = true;
            ListIterator<String> listIterator = cities.listIterator();
            if(cities.isEmpty()){
                System.out.println("No cities included");
                return;
            }else{
                System.out.println("Now visiting "+listIterator.next());
                printMenu();
            }
            
            while(!quit){
                int action = scanner.nextInt();
                scanner.nextLine();
                switch(action){
                    case 0 :
                        System.out.println("Holiday over");
                        quit = true;
                        break;
                        
                    case 1 :
                        if(!goingForward){
                            if(listIterator.hasNext()){
                                listIterator.next();
                            }
                            goingForward = true;
                        }
                        if(listIterator.hasNext()){
                            System.out.println("Now visiting "+listIterator.next());
                        }else{
                            System.out.println("Reached the end of the list");
                            goingForward = false;
                        }
                        break;
                    case 2 :
                        if(goingForward){
                            if(listIterator.hasPrevious()){
                                listIterator.previous();
                            }
                            goingForward = false;
                        }
                        if(listIterator.hasPrevious()){
                            System.out.println("Now visiting "+listIterator.previous());
                        }else{
                            System.out.println("We are at the start of the list");
                            goingForward = true;
                        }
                        break;
                    case 3 :
                        printMenu();
                        break;
                }
            }
        }
        public static void printMenu(){
            System.out.println("Available actions:\n press");
            System.out.println("0 - to quit \n"+
                               "1 - go to next city \n"+
                               "2 - go to previous city \n"+
                               "3 - print");
        }
}
    
    