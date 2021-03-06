

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

    public Money plus(Money added) {

        Money sumMoney = new Money(euros + added.euros, cents + added.cents);
        return sumMoney;
    }

    public boolean lessThan(Money compared) {

       int thisTotal = (this.euros*100) + this.cents;
        int comparedTotal = (compared.euros*100) + compared.cents;
        
        if (thisTotal < comparedTotal){
            return true;
        }
        else {
            return false;
        }
    }

    public Money minus(Money decremented) {
        int thisTotal = (this.euros*100) + this.cents;
        int decrementedTotal = (decremented.euros*100) + decremented.cents;
        int resultTotal = thisTotal - decrementedTotal;
        
        if (resultTotal > 0){
            Money result = new Money(0, resultTotal);
            return result;
        } else{
            Money result = new Money(0, 0);
            return result;
        }
        

    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
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
