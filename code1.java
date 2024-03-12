import java.util.Arrays;

public class ArraySortingAndCounting {

    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 5, 2, 9, 5, 8, 2};
        int numberToFind = 2;

       
        Arrays.sort(array);

        long occurrences = Arrays.stream(array).filter(num -> num == numberToFind).count();

        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Number of occurrences of " + numberToFind + ": " + occurrences);
    }
}
