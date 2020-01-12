public class Main
{
    public static void main(String[] args)
    {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        
        /*_ won't affect a int value*/
        /*int takes 32bits*/
        int myMaxIntTest = 2_147_483_647;
        System.out.println("The Int Test value = "+myMaxIntTest);
        
        /*byte takes 8bits*/
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = "+myMinByteValue);
        System.out.println("Byte Maximum value = "+myMaxByteValue);
        /*short takes 16 bits*/
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = "+myMinShortValue);
        System.out.println("Short Max Value = "+myMaxShortValue);
        
        /*long takes 64bits*/
        long myMaxLongValue = Long.MIN_VALUE;
        long myMinLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = "+myMinLongValue);
        System.out.println("Long Max Value = "+myMaxLongValue);
        
        /*Casting*/
        /*byte myNewByteValue = (myMinByteValue /2); this will not work since java will augomatically tream a number*/
        /*int when do arithmetic operation*/
        byte myNewByteValue = (byte)(myMinByteValue /2);
        
        long myPrimValue = 50000+10*(myMaxByteValue+myMinShortValue+myMinIntValue);
        System.out.println("The primitive value = "+myPrimValue);
        
        /*float takes 32bits*/
        float myMaxFloatValue = Float.MAX_VALUE;
        float myMinFloatValue = Float.MIN_VALUE;
        System.out.println("The Max Float = "+ myMaxFloatValue);
        System.out.println("The Min Float = "+myMinFloatValue);
        
        /*double takes 64bits*/
        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;
        System.out.println("The Max Double = "+myMaxDoubleValue);
        System.out.println("The Min Double = "+myMinDoubleValue);
        
        /*char takes 16bits and only store one character*/
        char myChar = 'D';/*use single quote for char*/
        char myUnicodeChar = '\u0044';
        System.out.println("My Char = "+myChar);
        System.out.println("My Char with Unicode = "+myUnicodeChar);
        
        /*boolean*/
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        
        /*Strings is a class, fit a large number in string can save memory(immutable)*/
        String myString = "This is my string";
        String mySecondString = "This is more";
        /*whatever appended to a string will be treated as a string*/
        System.out.println(myString+", "+mySecondString);
        
        /*if then statement*/
        boolean isAlien = true;
        boolean isHuman = true;
        if (isAlien == false){
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }else{
            System.out.println("It is an alien!!!");
        }
        
        /*AND and OR statement*/
        if(isAlien==true || isHuman==true){
            System.out.println("We found something alive");
        }
        
        int grade1 =100;
        int grade2 =100;
        if(grade1 == 100 && grade2 == 100){
            System.out.println("This is a AAA student");
        }
        
        /*Ternary Operator (condition) ? (value if true condition) (value if false condition)*/
        boolean isCar = true;
        boolean wasCar = isCar ? true:false;/*if isCar is true set wasCar to true, otherwise false*/
        
        
    }
}