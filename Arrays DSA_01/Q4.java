public class Q4 {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
    public static int  search(int[] nums , int target) {
        int start=0, end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }
            // search left side is shorted or not 
            if(nums[start] <= nums[mid]){
                // figure out if the element lies on left half or not
                if(target>= nums[start] && target<= nums[mid]){
                    end= mid -1;
                }else{
                    start= mid+1;
                }
            }
            // search right side is shorted or not
            else{
                if( target>=nums[mid] && target<= nums[end]){
                    start =mid+1;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
    
}
