
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        int length = array.length;
        
        for(int i = 0; i < length; i++){
            System.out.print(array[i]);
            if(i != length-1){
                System.out.print(", ");
            }
                
        }
    }
}
