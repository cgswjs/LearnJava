public class Main{
    public static void main(String[] args){
        //initialize an array has 10 integer elements
        int[] myIntArray = new int[10];
        //insert 50 to index 5 of this array
        myIntArray[5] = 50;
        //another way to initialize an array
        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};
        //3rd way to initialize an array
        int[] myIntArray3 = new int[10];
        for(int i =0;i<myIntArray3.length;i++){
            myIntArray3[i] = i*10;
        }
        printArray(myIntArray3);
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+ i + ", value is "+array[i]);
        }
    }
}