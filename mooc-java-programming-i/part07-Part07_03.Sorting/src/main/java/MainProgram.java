
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index of the smallest number: " + indexOfSmallest(array));
        System.out.println(indexOfSmallestFrom(array, 3));

        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
        
        System.out.println("sortare");
        
        int[] numbers2 = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers2));
        MainProgram.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexSmall = 0;
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                indexSmall = i;
            }
        }

        return indexSmall;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexSmall = startIndex;
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                indexSmall = i;
            }
        }

        return indexSmall;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swapper = array[index1];
        array[index1] = array[index2];
        array[index2] = swapper;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = indexOfSmallestFrom(array, i);
            swap(array, i, j);
        }
    }

}
