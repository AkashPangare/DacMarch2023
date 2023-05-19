public class Assignment4_1_2 {
    public static void main(String[] args) {
        int n=25;
        fib(n);
        System.out.println(fib(n));
    }

    private static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int fibb = fib1 + fib2;
        return fibb;
    }
}
