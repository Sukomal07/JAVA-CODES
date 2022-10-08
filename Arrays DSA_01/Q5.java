import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,4};
        System.out.println(threesum(nums));
    }
    public static List<List<Integer>>threesum(int nums[]) {
        //to declare a list : List<>
        //to declare a integer in list : List<List<Integer>>
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i =0; i<nums.length; i++){
            for(int j =i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triple = new ArrayList<Integer>();
                        triple.add(nums[i]);
                        triple.add(nums[j]);
                        triple.add(nums[k]);
                        Collections.sort(triple);
                        result.add(triple);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }
}
