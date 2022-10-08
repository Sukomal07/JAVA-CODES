public class Q4 {
    public static int mejorityInRange(int nums[], int num ,int si , int ei) {
        int count = 0;
        for(int i = si; i<=ei; i++ ){
            if(nums[i] == num){
                count++;
            }
        }
        return count;
        
    }
    public static int mejorityElement(int nums[], int si , int ei) {
        if(si == ei){
            return nums[si];
        }
        int mid = si +(ei-si)/2;
        int left = mejorityElement(nums, si, mid);
        int right = mejorityElement(nums, mid+1, ei);
        if(left == right){
            return left;
        }
        int leftCount = mejorityInRange(nums, left, si, ei);
        int rightCount = mejorityInRange(nums, right,  si, ei);
        return leftCount > rightCount ? left : right;
    }
    public static int mejority(int nums[]) {
        return mejorityElement(nums, 0, nums.length-1);
    }
    public static void main(String[] args) {
        int nums[] ={2,1,1,1,1,2,1};
        System.out.println(mejority(nums));
    }
}
