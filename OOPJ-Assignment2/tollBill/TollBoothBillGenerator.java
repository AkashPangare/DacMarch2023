import java.util.Scanner;

public class TollBoothBillGenerator {
    private String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;
    
    public static void main(String[] args) {
        TollBoothBillGenerator tollBooth = new TollBoothBillGenerator();
        tollBooth.showMenu();
    }
    
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nToll Booth Bill Generator Menu");
            System.out.println("-------------------------------");
            System.out.println("1. Enter vehicle type (car, van, bus, or truck)");
            System.out.println("2. Enter number of axles");
            System.out.println("3. Enter distance traveled");
            System.out.println("4. Calculate toll fee");
            System.out.println("5. Generate bill");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice (1-6): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle type (car, van, bus, or truck): ");
                    vehicleType = scanner.next();
                    break;
                case 2:
                    System.out.print("Enter number of axles: ");
                    numAxles = scanner.nextInt();
                    break;
                case 3:
                    System.out.print("Enter distance traveled (in miles): ");
                    distanceTraveled = scanner.nextDouble();
                    break;
                case 4:
                    tollFee = calculateTollFee();
                    System.out.printf("Toll fee: $%.2f\n", tollFee);
                    break;
                case 5:
                    totalAmountDue = tollFee + 2.00;
                    generateBill();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        }
        scanner.close();
    }
    
    private double calculateTollFee() {
        double baseRate = 0.25;
        if (vehicleType.equalsIgnoreCase("truck")) {
            baseRate = 0.50;
        }
        double tollFee = baseRate * numAxles * distanceTraveled;
        return tollFee;
    }
    
    private void generateBill() {
        System.out.println("\nBill Details");
        System.out.println("-------------");
        System.out.printf("Vehicle type: %s\n", vehicleType);
        System.out.printf("Number of axles: %d\n", numAxles);
        System.out.printf("Distance traveled: %.2f miles\n", distanceTraveled);
        System.out.printf("Toll fee: $%.2f\n", tollFee);
        System.out.printf("Processing fee: $2.00\n");
        System.out.printf("Total amount due: $%.2f\n", totalAmountDue);
    }
}
