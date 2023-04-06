import java.util.Scanner;

class telephoneBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Enter number of calls made: ");
        int numberOfCalls = sc.nextInt();
        System.out.print("Enter duration of calls (in minutes): ");
        int durationOfCalls = sc.nextInt();

        // Calculate the bill
        double bill = 10.0; // flat rate of $10 per month
        int numberOfCallsAbove100 = numberOfCalls - 100;
        if (numberOfCallsAbove100 > 0) {
            bill += (numberOfCallsAbove100 * 0.25) + (100 * 0.5);
        } else {
            bill += numberOfCalls * 0.5;
        }
        int roundedDurationOfCalls = (int) Math.ceil(durationOfCalls / 60.0); // round up to the nearest minute
        if (roundedDurationOfCalls < numberOfCalls) {
            bill += (numberOfCalls - roundedDurationOfCalls) * 0.5; // charge for calls not included in the duration
        }
        System.out.println("Customer name: " + customerName);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Number of calls made: " + numberOfCalls);
        System.out.println("Duration of calls (in minutes): " + durationOfCalls);
        System.out.println("Bill: $" + bill);
    }
}