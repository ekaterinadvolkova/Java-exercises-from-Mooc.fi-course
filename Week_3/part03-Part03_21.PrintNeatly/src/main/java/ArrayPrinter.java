
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 2,3};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int last= array.length;
        
        for (int index=0; index< last; index++) {
            System.out.print(array[last] + ", ");  
            if (index==last){
                System.out.print(array[index]);
                
            }
            
        }
        
       
        
    }
}
