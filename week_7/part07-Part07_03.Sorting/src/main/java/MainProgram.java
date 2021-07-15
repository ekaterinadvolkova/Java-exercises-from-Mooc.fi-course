import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array, int startIndex) {
        int minValue = Integer.MAX_VALUE;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] <= minValue) {
                minValue = array[i];
            }
        }

        return minValue;


    }
    public static int smallest(int[] array){
        int minValue = Integer.MAX_VALUE;
        for (int number : array) {
            if (number <= minValue) {
                minValue = number;
            }
        }

        return minValue;

    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array, 0);
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int index = 0;
        int smallest = smallest(table, startIndex);

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] == smallest) {
                index = i;
            }
        }

        return index;

    }

    public static void swap(int[] array, int index1, int index2) {
        int a = array[index1];
        array[index1] = array[index2];
        array[index2] = a;

    }

    public static void sort(int[] array) {

        for( int i =0; i< array.length; i++){
            swap(array, indexOfSmallestFrom(array, i), i);
            System.out.println(Arrays.toString(array));
        }

    }

    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
}
