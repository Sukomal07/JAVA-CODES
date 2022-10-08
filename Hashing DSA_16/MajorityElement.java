import java.util.HashMap;

public class MajorityElement {
    public static void checkMajority(int nums[]) {  // O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // if(map.containsKey(num)){
            // map.put(num, map.get(num)+1);
            // }else{
            // map.put(num, 1);
            // }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Set<Integer> set = map.keySet();
        for (Integer key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        checkMajority(nums);
    }
}
