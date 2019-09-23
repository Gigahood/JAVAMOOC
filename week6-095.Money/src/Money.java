
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    
    public Money plus(Money added){
         int newEuros = 0;
         int newCents;
         
         newCents = this.cents + added.cents();
         if(newCents > 100){
             newCents -= 100;
             newEuros ++;
         }
         
         newEuros += (this.euros + added.euros());
         
         return new Money(newEuros,newCents);
     }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public boolean less(Money compared){
        if(this.euros < compared.euros || (this.euros == compared.euros && this.cents < compared.cents)){
            return true;
        }
        
        return false;
    }
    
    public Money minus(Money decremented){
        int newEuros = 0;
        int newCents = 0;
        
        if(this.euros < decremented.euros() || (this.euros == decremented.euros() && this.cents < decremented.cents())){
            // do ntg
        }else{
            if(this.cents < decremented.cents()){
                newCents += (100 + this.cents - decremented.cents());
                newEuros--;
            }else{
                newCents += (this.cents - decremented.cents());
            }
            
            newEuros += (this.euros - decremented.euros());
        } 
            
         return new Money(newEuros,newCents);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
