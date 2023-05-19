import java.util.Scanner;

public class Assignment2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Sum of digits of number: "+findSum( n));
    }

    public static int findSum(int n) {
        int sum=0;
        while(n!=0){
           
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
}
