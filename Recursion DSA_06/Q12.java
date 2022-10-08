public class Q12 {
    public static void findElement(int arr[], int idx, int key) {
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
        findElement(arr, idx + 1, key);
    }
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        findElement(arr, 0, key);
        System.out.println();
    }
}