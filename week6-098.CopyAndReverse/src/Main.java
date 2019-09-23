
import java.util.Arrays;



public class Main {

   public static void main(String[] args) {
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
}
    
    public static int[] copy(int[] array){
        int length = array.length;
        int[] newArray = new int[length];
        
        for(int i = 0; i < length; i++){
            newArray[i] = array[i];
        }
        
        return newArray;
    }
    
    public static int[] reverseCopy(int[] array){
        int length = array.length;
        int[] newArray = new int[length];
        
        for(int i = 0; i < length; i++){
            newArray[length - (i + 1)] = array[i];
        }
        
        return newArray;
    }
    
}
