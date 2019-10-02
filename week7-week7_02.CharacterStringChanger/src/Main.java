public class Main {
    public static void main(String[] args) {
        // Test your program here
    Changer scandiesAway = new Changer();
  scandiesAway.addChange(new Change('A', 'I'));
  scandiesAway.addChange(new Change('!', '?'));
   scandiesAway.addChange(new Change('i', 'u'));
  System.out.println(scandiesAway.change("Architect!"));
    }
}
