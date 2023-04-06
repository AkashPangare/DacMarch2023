import java.util.Scanner;
class rational{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first rational number:");
        System.out.print("Numerator: ");
        int num1 = sc.nextInt();

        System.out.println("Denomenator");
        int den1 = sc.nextInt();

        System.out.println("Enter the second rational number:");
        System.out.print("Numerator: ");
        int num2 =sc.nextInt();

        System.out.println("Denomenator");
        int den2 = sc.nextInt();

        //addition
        int resNum1 = (num1*den1) +(num2*den1);
        int resDen1 = (den1 * den2);

        System.out.println("Result : "+resNum1 +"/" +resDen1);

        
    }

}