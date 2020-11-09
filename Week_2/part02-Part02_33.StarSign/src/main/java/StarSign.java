
public class StarSign {
    
    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");
        printSquare(5);
        System.out.println("\n---");
        printRectangle(17,3);
        System.out.println("\n---");
        printTriangle(5);
        
    } 
    
    public static void printStars(int number) {
        int n = 1;
        while (n <= number ) {
            System.out.print("*");
            n ++;
        }  
        System.out.println("");
    }
    
    public static void printSquare(int size) {
        int lines =1;
        while(lines<=size) {
            printStars(size);
            lines++;
        }
        
    }
    public static void printRectangle(int width, int height){
        int checkingLines =1;
        while (checkingLines<=height){
            printStars(width);
            checkingLines++;
        }
    }
    public static void printTriangle(int size){
        int topOfTriangle =1;
        while (topOfTriangle<=size){
            printStars(topOfTriangle);
            topOfTriangle++;
        }
        
        
    }

       
}
    

    
      
