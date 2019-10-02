
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        int length = characterString.length();
        int numberOfSmile = getNumberOfSmile(length);
        
        for(int i = 0; i < 3; i++){
            if(i == 1){
               printString(characterString);
            }else{
               printSmile(numberOfSmile);
            }
        }
        
    }
    
    public static void printString(String character){
       int length = character.length();
       
       if(length % 2 == 0){
           // even size
           System.out.print(":) " + character + " :)");
       }else{
           // odd size
           System.out.print(":) " + character + "  :)");
       }
        System.out.print("\n");
    }
    
    public static void printSmile(int number){
        for(int i = 0; i < number; i++){
            System.out.print(":)");
        }
        System.out.print("\n");
    }
    
    public static int getNumberOfSmile(int length){
        int number = 0;
        if(length % 2 == 0){
            number = (length + 6) / 2;
        }else{
            number = (length + 7) / 2;
        }
        
        return number;
    }
}
