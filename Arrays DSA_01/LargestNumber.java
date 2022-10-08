// import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        int numbers[] = {4,5,2,8,6,10,55};
        System.out.println("Largest number " + getLargest(numbers));
    }
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinty
        int smallest = Integer.MAX_VALUE; // +infinty
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest>numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number " + smallest);
        return largest;
    }
}
