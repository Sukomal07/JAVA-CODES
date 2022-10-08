import java.util.Arrays;
import java.util.HashMap;

public class Q2 {
    public static int[] twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                return new int[] {map.get(diff) ,i };
            }
            map.put(arr[i], i);
        }
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
