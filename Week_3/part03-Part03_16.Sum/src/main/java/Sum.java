
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(6);
        numbers.add(10);
        
        System.out.println(sum (numbers));
        
        numbers.add(23);
        numbers.add(6);
        numbers.add(10);
        
        System.out.println(sum (numbers));

    }
    
    public static int sum( ArrayList <Integer> numbers) {
       int sum=0;
       for (int number: numbers){
           sum=sum+number;
       }
       return sum ;
      
    }
}

    