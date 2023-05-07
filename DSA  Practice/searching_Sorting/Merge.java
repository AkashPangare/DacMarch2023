package dsa.searching_Sorting;

public class Merge {
    public static void main(String[] args) {
        int arr[]={1,4,5,2,3,7,9,6};
        merge(arr,0,arr.length-1);
        print(arr);
    }
    
    public static void merge(int arr[],int si, int ei) {
        if(si>=ei){
            return;
        }
       int mid=si+(ei-si)/2;
        merge(arr,si,mid);
        merge(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    private static void merge(int[] arr, int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0 ,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    private static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println( );
    }
    
}
