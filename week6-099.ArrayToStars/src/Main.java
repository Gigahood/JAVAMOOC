
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        int numberOfStars;
        
        for(int line : array){
            numberOfStars = line;
            for(int i = 0; i < numberOfStars; i++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
