import java.util.Scanner;

public class Assignment2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        long n = sc.nextLong();
        System.out.print("Number of digits : "+ countDigit(n));
    }

    private static int countDigit(long n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
