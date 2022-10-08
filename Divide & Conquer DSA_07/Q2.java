public class Q2 {
    // search in roted array
    public static int Search(int arr[] , int tar, int si,int ei) {
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid] == tar){
            return mid;
        }
        // search in line L1
        if(arr[si] <= arr[mid]){
            if(arr[si] <= tar && tar <= arr[mid]){
                return Search(arr, tar, si, mid);
            }else{
                return Search(arr, tar, mid+1, ei);
            }
        }
        // search in line 2
        else{
            if(arr[mid] <= tar && tar<= arr[ei]){
                return Search(arr, tar, mid+1, ei);
            }else{
                return Search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,2};
        int tar = 0;
        int idx = Search(arr, tar, 0, arr.length-1);
        System.out.println(idx);
    }
}
