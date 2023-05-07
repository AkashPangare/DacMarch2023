package dsa.searching_Sorting;

public class selection {
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,6,3};
    print(arr);
    selectionSort(arr);
    print(arr);
    }

    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]= temp;
        }
    }
    private static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println( );
    }
    
}
