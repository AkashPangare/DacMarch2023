import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeConverter {
    public static void main(String[] args) {
        // Accept date and time input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date and time in the format dd/mm/yyyy hh:mm:ss a: ");
        String input = scanner.nextLine();

        // Parse input string into LocalDateTime object
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        LocalDateTime dateTime = LocalDateTime.parse(input, inputFormatter);

        // Convert date and time to different formats
        String outputA = dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String outputB = dateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        String outputC = dateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        String outputD = dateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String outputE = dateTime.format(DateTimeFormatter.ofPattern("hh:mm:ss a"));
        String outputF = dateTime.format(DateTimeFormatter.ofPattern("HH:mm"));
        String outputG = dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String outputH = dateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a"));
        String outputI = dateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));

        // Display converted date and time in different formats
        System.out.println("Converted date and time:");
        System.out.println("dd/MM/yyyy: " + outputA);
        System.out.println("MM/dd/yyyy: " + outputB);
        System.out.println("yyyy/MM/dd: " + outputC);
        System.out.println("HH:mm:ss: " + outputD);
        System.out.println("hh:mm:ss a: " + outputE);
        System.out.println("HH:mm: " + outputF);
        System.out.println("dd/MM/yyyy HH:mm:ss: " + outputG);
        System.out.println("MM/dd/yyyy hh:mm:ss a: " + outputH);
        System.out.println("yyyy/MM/dd HH:mm: " + outputI);

        scanner.close();
    }
}

