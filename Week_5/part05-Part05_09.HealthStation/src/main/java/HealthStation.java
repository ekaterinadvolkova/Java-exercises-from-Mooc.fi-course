
public class HealthStation {
    private int numberOfWeightings=0;


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        numberOfWeightings = numberOfWeightings+1;
        return person.getWeight();
        
    }
    
    public void feed(Person person){
        person.feed();
        
    }
    
    public int weighings(){
        return this.numberOfWeightings;
    }

}
