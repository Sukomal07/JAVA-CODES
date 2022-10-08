public class Q5 {
    public static int merge(int a[], int left, int mid, int right) {
        int i = left, j = mid, k = 0;
        int invCount = 0;
        int temp[] = new int[(right - left + 1)];
        while ((i < mid) && (j <= right)) {
            if (a[i] <= a[j]) {
                temp[k] = a[i];
                k++;
                i++;
            } else {
                temp[k] = a[j];
                invCount += (mid - i);
                k++;
                j++;
            }
        }
        while (i < mid) {
            temp[k] = a[i];
            k++;
            i++;
        }
        while (j <= right) {
            temp[k] = a[j];
            k++;
            j++;
        }
        for (i = left, k = 0; i <= right; i++, k++) {
            a[i] = temp[k];
        }
        return invCount;
    }

    public static int mergeSort(int a[], int left, int right) {
        int invCount = 0;
        if (right > left) {
            int mid = (right + left) / 2;
            invCount = mergeSort(a, left, mid);
            invCount += mergeSort(a, mid + 1, right);
            invCount += merge(a, left, mid + 1, right);
        }
        return invCount;
    }

    public static int getInvCount(int a[]) {
        int n = a.length;
        return mergeSort(a, 0, n - 1);
    }

    public static void main(String[] args) {
        int a[] = {2,4,1,3,5};
        // int a[] = { 1, 20, 6, 4, 5 };
        System.out.println("inversion count = " + getInvCount(a));
    }
}
