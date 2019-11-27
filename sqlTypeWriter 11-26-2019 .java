package useTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner (System.in); // this helps so a user can input variables
		String sqlDatabaseInput; // A way to make the user input to string
		char choice; // this is for the y/n areas
		
		ArrayList <String> databaseNames = new ArrayList<String>(); // For database names only from the database server
		ArrayList <String> selectNames = new ArrayList<String>(); // For columns you want to see in the results
		ArrayList <String> fromNames = new ArrayList<String>(); // For what tables you want from the SQL database
		System.out.println("Welcome to SQL TypeWriter Version: December Snow");
		System.out.println("Created by: Christopher Negron");
		System.out.println("If any problems or want to improve code do so @GitHub: ACipher118");
		
		// This part works with the database input
		do {
			System.out.println("Enter Name of database:");
			sqlDatabaseInput = userInput.next();
			databaseNames.add(sqlDatabaseInput);
			System.out.println("Would you like to enter a other database? y/n");
			choice = userInput.next().charAt(0);
		}
		
		while ((choice == 'y') || (choice == 'Y')); 
		
		
		// This part takes in the input for the SELECT statement
		do {
			System.out.println("Enter Name of colum you want:");
			sqlDatabaseInput = userInput.next();
			selectNames.add(sqlDatabaseInput);
			
			System.out.println("Would you like to enter a other colum? y/n");
			choice = userInput.next().charAt(0);
			
		}
		while ((choice == 'y') || (choice == 'y'));
		
		// This part takes input for the FROM input
		
		do {
			System.out.println("Enter Name of table you want:");
			sqlDatabaseInput = userInput.next();
			fromNames.add(sqlDatabaseInput);
			
			System.out.println("Would you like to enter a other table? y/n");
			choice = userInput.next().charAt(0);
		}
		while ((choice == 'y')|| (choice == 'Y'));
		System.out.println("TypeWriter has created code!!!");// This is the end
		System.out.println("\nUSE " +databaseNames.toString() +"\nSELECT " + selectNames.toString() +"\nFROM "+fromNames.toString()); //Prints out the code needed for the sql server.
		userInput.close();
	}
	
}
