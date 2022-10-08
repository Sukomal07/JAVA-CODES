public class Q3 {
    public static void main(String[] args) {
        int nums[] ={ 1,2,3,2,8,3,4} ;
        System.out.println(name(nums)); 
    }
    public static boolean name(int nums[]) {
        for(int i =0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j] ){
                    return true;
                }
            }
        }
        return false;
    }
}
