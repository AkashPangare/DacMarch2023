import java.util.Scanner;

public class Assignment2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        count(n);

    }
    public static void count(int n){
        int even_count = 0;
        int odd_count=0;
        while(n>0){
         int rem = n%10;
        if(rem%2==0){
            even_count++;
        }
        else{
            odd_count++;
        }
        n=n/10;
        }
        System.out.println("Number of even digits:"+even_count);
        System.out.println("Number of odd digits:"+odd_count);
    }

       
}

