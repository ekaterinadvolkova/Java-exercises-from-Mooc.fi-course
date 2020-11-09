
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 0, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        
        //provide as may lines as numbers in array
        for (int lines=0; array.length>lines; lines++) { 
            
            // each line prints needed amount of *
            for (int stars=0; stars <array [lines]; stars++) {
                System.out.print("*");
                if (array[lines]==0) {
                    System.out.print("");
                }
            }
            
            //going to new line
            System.out.println("");
            
        }
    }

}
 