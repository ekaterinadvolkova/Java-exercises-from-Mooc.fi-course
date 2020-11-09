
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money=1000.0;
    }

    public double eatAffordably(double payment) {
        
        double change = payment - 2.50;
                
        if(change<=money && payment>=2.50){
        this.money=this.money+2.50;
        affordableMeals++;
        return change;
        } else {
            return payment;
        }
   
        
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change = payment - 4.30;
        
        if(change<=money && payment>=4.30){
        this.money=this.money+4.30;
        heartyMeals++;
        return change;
        } else {
            return payment;
        }
    }
    public boolean eatAffordably(PaymentCard card) {        
        
        if (card.takeMoney(2.50)) {
            affordableMeals++;
            return true;
        } else {
            return false;
        }         
    }

    public boolean eatHeartily(PaymentCard card) {
       if (card.takeMoney(4.30)) {
            heartyMeals++;
            return true;
        } else {
            return false;
        } 
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        if (sum>0){
           money=money+sum; 
        }
        
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
