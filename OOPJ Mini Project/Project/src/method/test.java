package method;
import java.util.ArrayList;
import java.util.Scanner;
import blood.Donor;
import blood.Recipient;

public class test {
	//public static Scanner sc = new Scanner(System.in);
	
	private static ArrayList<Donor> donors = new ArrayList<>();
	 private static ArrayList<Recipient> recipients = new ArrayList<>();
	 
	//Add Donor Method 
	public static void addDonor(Scanner sc) {
		//System.out.println("Enter donor details:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Blood Type: ");
        String bloodType = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Mobile Number ");
        String mobileNumber = sc.next();
        Donor donor = new Donor(name, bloodType, age, mobileNumber);
        donors.add(donor);
        System.out.println("Donor added successfully.");
		
	}

	//Add Recipient Method
	public static void addRecipient(Scanner sc) {
		//System.out.println("Enter recipient details:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Blood Type: ");
        String bloodType = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Mobile Number ");
        String mobileNumber = sc.next();
        Recipient recipient = new Recipient(name, bloodType, age, mobileNumber);
        recipients.add(recipient);
        System.out.println("Recipient added successfully.");
		
	}

	//Display Donor Method
	public static void displayDonors() {
		System.out.println("List of donors:");
        for (Donor donor : donors) {
            System.out.println(donor);
        }
		
	}

	//Display Recipients Method
	public static void displayRecipients() {
		System.out.println("List of recipients:");
        for (Recipient recipient : recipients) {
            System.out.println(recipient);
        }
		
	}

	//Search Donor Method
	public static void searchDonor(Scanner sc) {
		System.out.print("Enter donor blood group to search: ");
        String bloodType = sc.next();

        boolean found = false;

        for (Donor donor : donors) {
        	if (donor.getBloodType().equalsIgnoreCase(bloodType)) {
                System.out.println(donor.toString());
                found = true;
            }
		}

        if (!found) {
            System.out.println("No donor found with blood group " + bloodType);
        }
		
	}

	//Search Recipients Method
	public static void searchRecipients(Scanner sc) {
		System.out.print("Enter Recipients blood group to search: ");
        String bloodType = sc.next();

        boolean found = false;

        for (Recipient recipient : recipients) {
        	if (recipient.getBloodType().equalsIgnoreCase(bloodType)) {
                System.out.println(recipient.toString());
                found = true;
            }
		}

        if (!found) {
            System.out.println("No recipients found with blood group " + bloodType);
        }
		
	}

	//Remove Donor Method
	public static void removeDonar(Scanner sc) {
		System.out.print("Enter Donor name you want to remove: ");
        String name = sc.next();
        
        for (Donor donor : donors) {
        	if (donor.getName().equalsIgnoreCase(name)) {
        		donors.remove(donor);
                System.out.println("Donor removed successfully");
        	}else {
        		System.out.println("Donor removing failed");
        	}
		
	
        }
	
	

	}

	//Remove Recipient Method
	public static void removeRecipient(Scanner sc) {
		System.out.print("Enter Recipient name you want to remove: ");
        String name = sc.next();
        
        for (Recipient recipient : recipients) {
        	if (recipient.getName().equalsIgnoreCase(name)) {
        		recipients.remove(recipient);
                System.out.println("Recipient removed successfully");
        	}else {
        		System.out.println("Recipient removing failed");
        	}
		
	
        }
		
	}
}
