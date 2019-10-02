
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
sort(values);
    }
    
    public static int smallest(int [] values){
        int smallest = values[0];
        int length = values.length;
        
        for(int i = 0; i< length; i++){
            if(values[i] < smallest){
                smallest = values[i];
            }
        }
        
        return smallest;
    }
    
    public static int indexOfTheSmallest(int [] values){
        int smallest = smallest(values);
        int index = 0;
        int length = values.length;
        
        for(int i = 0; i < length; i++){
            if(values[i]  == smallest){
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int [] array, int index){
        int smallest = array[index];
        int smallestIndex = index;
        int length = array.length;
        
        for(int i = index; i < length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                smallestIndex = i;
            }
            
        }
        
        return smallestIndex;
    }
    
    public static void swap(int [] array, int index1, int index2){
        int value1 = array[index1];
        int value2 = array[index2];
        
        array[index1] = value2;
        array[index2] = value1;
    }
    
    public static void sort(int [] array){
        int length = array.length;

        for(int i = 0; i < length; i++){
            System.out.println( Arrays.toString(array) );
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }

}
