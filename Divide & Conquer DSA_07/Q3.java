public class Q3 {
    public static String[] mergeSort(String arr[], int si, int ei) {
        if (si == ei) {
            String A[] = { arr[si] };
            return A;
        }
        int mid = si + (ei - si) / 2;
        String arr1[] = mergeSort(arr, si, mid);
        String arr2[] = mergeSort(arr, mid + 1, ei);
        String arr3[] = merge(arr1, arr2);
        return arr3;
    }

    static String[] merge(String arr1[], String arr2[]) {
        int m = arr1.length;
        int n = arr2.length;

        String arr3[] = new String[m + n];
        int idx = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (isSmaller(arr1[i], arr2[j])) {
                arr3[idx] = arr1[i];
                i++;
                idx++;
            } else {
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }
        while (i < m) {
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }
        while (j < n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }

    static boolean isSmaller(String arr1, String arr2) {
        if (arr1.compareTo(arr2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        String A[] = mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+ " ");
        }
    }
}
