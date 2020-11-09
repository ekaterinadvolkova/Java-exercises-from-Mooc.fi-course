
public class FromOneToParameter {

    public static void main(String[] args) {
        
         printFromNumberToOne (9);  
         
    }

    private static void  printFromNumberToOne (int number) {
        
        int i = 1;
        
        while (number >= i) {
            
            System.out.println(number);
            number = number-1;     
            
        }   
    }  
}
