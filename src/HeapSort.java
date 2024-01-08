public class HeapSort {
    public static void main(String[] args) {
        int []arr= {10, 30, 50, 20, 35, 15};
        int n=arr.length;
        heapSort(arr, n);
        System.out.println("Sorted array:");
        printArr(arr);
    }

    // Extract elements from heap one by one
    private static void heapSort(int []arr, int n){
        buildHeap(arr, n);
        for(int i=n-1; i>0; i--){
            // Swap the root (maximum element) with the last element
            swap(arr, i, 0);
            // Call max heapify on the reduced heap
            heapify(arr, i-1, 0);
        }
    }

    // Build max heap
    private static void buildHeap(int []arr, int n){
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }
    }

    // To heapify a subtree rooted with node i which is an index in arr[]
    private static void heapify(int []arr, int n, int i){
        int largest=i;  // Initialize largest as root
        int l= 2*i;
        int r= 2*i+1;

        if(l<=n && arr[l]>arr[largest]) largest=l;
        if(r<=n && arr[r]>arr[largest]) largest=r;

        // If largest is not root
        if(largest!=i){
            swap(arr, i, largest);
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }

    }
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
