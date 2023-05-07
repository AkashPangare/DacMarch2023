package dsa.searching_Sorting;

public class Linear {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        int key=4;
        int index = linearsearch(numbers,key);
        System.out.println("Key is at index: "+index);
    }
    
    private static int linearsearch(int[] numbers, int key) {
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
}
