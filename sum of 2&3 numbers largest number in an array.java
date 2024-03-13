import java.util.Arrays;

public class SumOf2ndAnd3rdLargest {
    public static void main(String[] args) {
        
        int[] values = {10, 51, 53, 39, 47, 44, 21};

        
        int[] sortedArray = Arrays.copyOf(values, values.length);
        Arrays.sort(sortedArray);

        int secondLargest = sortedArray[sortedArray.length - 2];
        int thirdLargest = sortedArray[sortedArray.length - 3];

        
        int sum = secondLargest + thirdLargest;

        
        System.out.println("The 2nd largest number is: " + secondLargest);
        System.out.println("The 3rd largest number is: " + thirdLargest);
        System.out.println("Sum of 2nd and 3rd largest numbers is: " + sum);
    }
}
