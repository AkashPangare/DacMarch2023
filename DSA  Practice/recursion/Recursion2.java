package dsa;

public class Recursion2 {
    public static void main(String[] args) {
        int n = 10;
        reversePrint(n);
    }

    private static void reversePrint(int n) {
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        reversePrint(n-1);
        System.out.print(n+" ");

    }
}
