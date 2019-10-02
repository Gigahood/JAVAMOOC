import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        ArrayList<Integer> inputNumberArray = new ArrayList<Integer>();
        inputNumberArray = getInput(scan);
        
        GradeDistribution grade = new GradeDistribution();
        System.out.println("");
        grade.printGrade(inputNumberArray);
        System.out.println("Acceptance percentage : " + grade.calculatePercentage(inputNumberArray));
        
    }
    
    public static ArrayList<Integer> getInput(Scanner scan){
        int input;
        ArrayList<Integer> inputNumberArray = new ArrayList<Integer>();
        
        System.out.println("Type exam scores, -1 completes:");
        do{
            input = scan.nextInt();
            if(input >= 0 && input <= 60){
               inputNumberArray.add(input);
            }
        }while (input != -1);
        
        return inputNumberArray;
    }
}
