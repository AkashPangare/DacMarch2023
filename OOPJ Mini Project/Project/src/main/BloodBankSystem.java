package main;

import method.test;
import java.util.Scanner;

public class BloodBankSystem {
	private static Scanner sc = new Scanner(System.in);
	 
	 //Menu list 
	 private static int menuList( ) {
		 System.out.println("Blood Bank Management System");
         System.out.println("-----------------------------");
		 System.out.println("1.Add Donor");
		 System.out.println("2.Add Recipient");
		 System.out.println("3.Display Donors");
		 System.out.println("4.Display Recipients");
		 System.out.println("5.Search Donor");
		 System.out.println("6.Search Recipient");
		 System.out.println("7.Remove Donar");
		 System.out.println("8.Remove Recipient");
		 System.out.println("9.Exit");
		 System.out.print("Enter choice : ");
		 return sc.nextInt();
	 }
	 
	 public static void main(String[] args) {
		int choice;
		while( ( choice = BloodBankSystem.menuList( ) ) != 0 ) {
			 switch( choice ) {
			 case 1:
				 test.addDonor(sc);
				 break;
			 case 2:
				 test.addRecipient(sc);
				 break;
			 case 3:
				 test.displayDonors();
				 break;
			 case 4:
				 test.displayRecipients();
				 break;
			 case 5:
				 test.searchDonor(sc);
				 break;
			 case 6:
				 test.searchRecipients(sc);
				 break;
			 case 7:
				 test.removeDonar(sc);
				 break;
			 case 8:
				 test.removeRecipient(sc);
			 case 9:
				 System.exit(0);
				 break;
			 }
		}
	 }
}
