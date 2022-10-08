public class Binarysearch {
    public static void main(String[] args) {
        int numbers[] = {4,6,7,12,45,10};
        int key = 12;
        System.out.println(" index for key is " + binary(numbers, key)); 
    }
    public static int binary(int numbers[] , int key) {
        int start = 0, end = numbers.length-1;
        while (start<= end) {
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if (numbers[mid] < key) {
                start= mid +1;

            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
