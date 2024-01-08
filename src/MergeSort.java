
public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Lets do MergeSort");
        int []arr= {64, 88, 12, 29, 11};
        int n= arr.length;
        System.out.println("input array is:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sort(arr, 0, n-1);
        System.out.println();
        System.out.println("Sorted array is: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void sort (int[] arr, int l, int r){
        if(l<r){
            int m= l+(r-l)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] a, int l, int mid, int r) {
        int[] b = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0;
        while (i <= mid && j <= r) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= r) {
                b[k++] = a[j++];
            }
        } else {
            while (i <= mid) {
                b[k++] = a[i++];
            }
        }
        for (int ind = 0; ind < r - l + 1; ind++) {
            a[l+ ind] = b[ind];  // Adjusted index for original array
        }

    }



}
