package in.acts.cdac.main;

import java.util.Iterator;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Sentence: ");
		 String str = sc.nextLine();
		 int count = 1;
		 
		 for(int i = 0; i<str.length()-1; i++) {
			 if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
				 count++;
			 }
		 }
		   System.out.println("Number of words in sentence : "+count);  
        }
	}





