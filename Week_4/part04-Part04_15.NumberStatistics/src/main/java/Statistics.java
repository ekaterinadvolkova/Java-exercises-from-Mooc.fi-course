
public class Statistics {
    private int amountOfNumbers;
    private int sum;
    
    public Statistics(){
        amountOfNumbers = 0;
        
    }
    
    public void addNumber(int number){
        if (number != -1){
            this.amountOfNumbers++;
            this.sum += number;
        }
    }
    
    public int getCount(){
        return this.amountOfNumbers;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        if (sum() != 0 && getCount() != 0){
            return (double) sum() / (double) getCount();
        }
        return 0;
    }
}
