package dsa.searching_Sorting;

public class Binary {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        int key = 5;
        System.out.println("key is at index: "+bi(arr,key));
    }

    public static int bi(int[] arr, int key) {
        
        int start = 0 , end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;

            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
