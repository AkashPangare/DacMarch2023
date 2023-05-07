package dsa;

public class Recursion3 {
    public static void main(String[] args) {
        int n =5;
        factorial(n);
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n==0){
            return 1;
        }
        int fn1 = factorial(n-1);
        int fn = n*factorial(n-1);
        return fn;
    }
}
