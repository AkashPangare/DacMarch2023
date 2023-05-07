package dsa;

public class Recursion4 {
    public static void main(String[] args) {
        int n=10;
        sum(n);
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if(n==1){
            return 1;
        }
        int sum1 = sum(n-1);
        int summ = n + sum1;
        return summ;

    }
}
