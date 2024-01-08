

public class BubbleSort {
    public static void main(String[] args) {

        System.out.println("Lets do bubbleSort");
        int []arr= {64, 88, 12, 29, 11};
        int n= arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(j, j+1, arr);
                }
            }
        }

        printArray(arr);
    }

    private static void swap(int j, int i, int[] arr) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    private static void printArray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
