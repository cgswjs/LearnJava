/*use extends to inherit from another class*/
//inheritance makes this Dog class able to use all methods defined in Animal class
public class Dog extends Animal{
    
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    
    public Dog(String name, int size, int weight,int eyes, int legs, int tail, int teeth, String coat){
        //super can only can used in a constructor
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
        
    }
    private void chew(){
        
        System.out.println("Dog chews");   
    }
    
    //use override to create the same class from Animal class but only corresponds to Dog class
    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        //use super to call methods in parent class
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.work() called");
        //always use super to call method that's not in this class in case a method with the same name will be created later
        //in this class
        super.move(5);
    }
    public void run(){
        
        System.out.println("Dog.run() called");
        //with out a super, this function will call the move method inside this Dog class first
        move(100);
    }
    @Override
    public void move(int speed){
        System.out.println("Dog.move() is called and Dog is moving at "+speed);
    }
    
    
}