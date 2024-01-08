public class QuickSort {
    public static void main(String[] args) {
        int []arr= {4, 6, 2, 5, 7, 9, 1, 3};
        int low=0;
        int high=arr.length-1;
        quickSort(arr, low, high);
        System.out.println("Sorted array:");
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int []arr, int l, int h){
        if(l<h){
            int pivot=partition(arr, l, h);
            quickSort(arr, l, pivot-1);
            quickSort(arr, pivot+1, h);
        }
    }
    public static int partition(int[] arr, int l, int h){
        int pivot= arr[l];
        int i=l;
        int j=h;

        while(i<j){
            while(i<h && arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<j){
                swap(arr, i, j);
            }
        }
        if(j!=l) swap(arr, j, l);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
