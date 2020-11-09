

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber (2);
    }
    
 

    private static void  printUntilNumber (int number) {
        int i = 0;
        while (true) {
            
            if ( number > i) {
                
                i = i+1;
                System.out.println(i);
            } else{
                break;
            }
            
        }
        
    }
    
}

