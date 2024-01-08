import static java.util.Collections.swap;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Lets do selectionSort");
        int []arr= {64, 88, 12, 29, 11};
        int n= arr.length;

        for(int i=0; i<n-1; i++){
            int minInd=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minInd]){
                    minInd=j;
                }
            }
            swap(i, minInd, arr);
        }

        printArray(arr);

    }

    private static void swap(int i, int minInd, int[] arr) {
        int temp=arr[minInd];
        arr[minInd]=arr[i];
        arr[i]=temp;
    }

    private static void printArray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
