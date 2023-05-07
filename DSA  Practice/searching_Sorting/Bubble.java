package dsa.searching_Sorting;

public class Bubble {
   public static void main(String[] args) {
    int arr[] = {1,5,3,2,4};
    print(arr);
    bubbleSort(arr);
    print(arr);
   }

private static void print(int[] arr) {
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println( );
}

private static void bubbleSort(int[] arr) {
    for(int turn=0;turn<arr.length-1;turn++){
        for(int j=0;j<arr.length-1-turn;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
} 

}
