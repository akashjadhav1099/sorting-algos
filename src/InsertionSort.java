public class InsertionSort {
    public static void main(String[] args) {

        System.out.println("Lets do InsertionSort");
        int []arr= {64, 88, 12, 29, 11};
        int n= arr.length;

        for (int i=0; i<n; i++){
            int key= arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        printArray(arr);
    }
    private static void printArray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
