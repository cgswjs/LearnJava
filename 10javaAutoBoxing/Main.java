import java.util.ArrayList;

class IntClass{
    
}
public class Main{
    public static void main(String[] args){
        //way to create an Array
        String[] strArray = new String[10];
        int[] intArray = new int[10];
        //way to create ArrayList
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Yihan");
        
        // this won't work ArrayList<int> intArrayList = new ArrayList<int>();
        // because primitive type can't be passed to ArrayList class
        // so we can either write a class or use autoBoxing
        // autoBoxing converts primitive types to classes
        Integer interger = new Integer(10);
        Double doubleValue = new Double(10.25);
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            //Integer.valueOf() takes primitive type and convert them to class type
            intArrayList.add(Integer.valueOf(i));
        }
        for(int i=0;i<10;i++){
            //auto-unboxing by using .intValue() to convert it back to primitive type int
            System.out.println(i + " --> " +intArrayList.get(i).intValue());
        }
        
        //shorter way to do auto-boxing and unboxing
        Integer myIntValue = 56;//this create a class integer 56,same as Integer.valueOf(56);
        int myInt = myIntValue.intValue();
        
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0;dbl<=10.0;dbl+=0.5){
            //auto-boxing
            myDoubleValues.add(Double.valueOf(dbl));
        }
        for(int i=0;i<myDoubleValues.size();i++){
            //auto-unboxing
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i+" --> "+value);
        }
        
    }
    
    
    
    
}