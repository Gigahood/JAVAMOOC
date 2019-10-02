
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        String input = "1\n" + "HA-LOL\n" + "42\n" + "x\n";
        Scanner scan1 = new Scanner(input);
        Scanner scan = new Scanner(System.in);
        Panel panel = new Panel();
        
        panel.start(scan);
        //panel.start(scan1);
        
    }
}
