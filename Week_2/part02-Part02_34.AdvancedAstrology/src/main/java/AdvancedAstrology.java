
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int n = 1;
        while (n <= number ) {
            System.out.print("*");
            n ++;
        }  
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int k = 1;
        while (k <= number ) {
            System.out.print(" ");
            k ++;
        } 
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int stars=1;
        int spaces =size;
        
        while (stars<=(size)) {
            spaces=spaces-1;
            printSpaces(spaces);
            printStars(stars);
            stars=stars+1;  
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int stars=1;
        int spaces =height;
        
        while (stars<=(height+height-1)) {
            spaces=spaces-1;
            printSpaces(spaces);
            printStars(stars);
            stars=stars+2;  
        }
        printSpaces(height-2);
        System.out.println("***");
        printSpaces(height-2);
        System.out.println("***");
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(30);
    }
}
