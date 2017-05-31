//************************************************
//           Name: Cody Boker
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Work:  Project 2
//           Due Date:  September 30, 2009
//
//************************************************

//************************************************
//  The purpose of this class is to be the driver
//  for Project2 and test Person, ExtPerson, Date,
//  Address, and AddressBook.
//************************************************

import java.io.*;
import java.util.*;

public class Project2 
{
	//-------------------------------------------------------------
	// INSTANCE VARIBALES 
	//-------------------------------------------------------------
	static BufferedReader keyboard = new 
		BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws 
								IOException, FileNotFoundException
	{
		AddressBook addressBook = new AddressBook();
		String str;
		String str1;
		String str2;
		int choice;
		int loc;
		int month;
		
		String firstname, lastname;
		int day, year;
		String street, city, state, zip, phone, pStatus;
		
		ExtPerson temp;
		
		loadAddressBook(addressBook);
		
		showMenu();
		
		choice = Integer.parseInt(keyboard.readLine());
		
		while(choice != 10)
		{
			switch(choice)
			{
			case 1: System.out.print("Enter the last name of the person:");
						System.out.flush();
						str = keyboard.readLine();
						System.out.println();
						
						loc = addressBook.search(str);
						
						if(loc != -1)
							System.out.println(str + " is in the address book.");
						else
							System.out.println(str + " is not in the address book");
						break;
			case 2: System.out.print("Enter the last name of the person:");
						System.out.flush();
						str = keyboard.readLine();
						System.out.println();
			
						loc = addressBook.search(str);
			
						if(loc != -1)
							addressBook.printAt(loc);
						else
							System.out.println(str + " is not in the address book");
						break;
			case 3: System.out.print("Enter the month number:");
						System.out.flush();
						month = Integer.parseInt(keyboard.readLine());
						System.out.println();
						
						addressBook.printNameInTheMonth(month);
						break;
			case 4: System.out.print("Enter starting last name:");
						System.out.flush();
						str1 = keyboard.readLine();
						System.out.println();
						
						System.out.print("Enter ending last name:");
						System.out.flush();
						str2 = keyboard.readLine();
						System.out.println();
						
						addressBook.printNamesBetweenLastNames(str1, str2);
						break;
			case 5: System.out.print("Enter person type Family, Friend, Buisness:");
						System.out.flush();
						str = keyboard.readLine();
						System.out.println();
						
						addressBook.printNamesWithStatus(str);
						break;
			case 6: addressBook.print();
						break;
			case 7: saveData(addressBook);
						break;
			case 8:
				System.out.print("Enter first name: ");
				System.out.flush();
				firstname = keyboard.readLine();
				System.out.println();
				
				System.out.print("Enter last name: ");
				System.out.flush();
				lastname = keyboard.readLine();
				System.out.println();
				
				System.out.print("Enter the month in number: ");
				System.out.flush();
				month = Integer.parseInt(keyboard.readLine());
				System.out.println();
				
				System.out.print("Enter the day in number: ");
				System.out.flush();
				day = Integer.parseInt(keyboard.readLine());
				System.out.println();
				
				System.out.print("Enter the year in number: ");
				System.out.flush();
				year = Integer.parseInt(keyboard.readLine());
				System.out.println();
				
				System.out.print("Enter street: ");
				System.out.flush();
				street = keyboard.readLine();
				System.out.println();
				
				System.out.print("Enter city: ");
				System.out.flush();
				city = keyboard.readLine();
				System.out.println();
				
				System.out.print("Enter state: ");
				System.out.flush();
				state = keyboard.readLine();
				System.out.println();
				
				System.out.print("Enter zip code: ");
				System.out.flush();
				zip = keyboard.readLine();
				System.out.println();
				
				System.out.print("Enter phone: ");
				System.out.flush();
				phone = keyboard.readLine();
				System.out.println();
				
				System.out.print("Enter status: ");
				System.out.flush();
				pStatus = keyboard.readLine();
				System.out.println();
				
				temp = new ExtPerson();
				temp.setInfo(firstname, lastname, month, day, year,
						street, city, state, zip, phone, pStatus);
				addressBook.insert(temp);
				break;
			case 9: System.out.print("Enter the first name of the person: ");
			System.out.flush();
			firstname = keyboard.readLine();
			System.out.println();
			
			System.out.print("Enter the last name of the person: ");
			System.out.flush();
			lastname = keyboard.readLine();
			System.out.println();
			
			temp = new ExtPerson();
			temp.setInfo(firstname, lastname, 1, 1, 2000, "","","","","","");
			addressBook.deleteNode(temp);
			break;
				
			default: System.out.println("Invalid choice");
			}
			
			showMenu();
			choice = Integer.parseInt(keyboard.readLine());							
		}
		
	char response;
	
	System.out.print("Save data Yes(Y/y) No(N/n)?: ");
	System.out.flush();
	response = keyboard.readLine().charAt(0);
	System.out.println();
	
	}// END OF MAIN
	
	public static void loadAddressBook(AddressBook adBook) throws IOException,
										FileNotFoundException
	{
		BufferedReader infile;
		
		String filename;
		String inputStr;
		
		StringTokenizer tokenizer;
		
		String first;
		String last;
		
		int month;
		int day;
		int year;
		
		String street;
		String city;
		String state;
		String zip;
		
		String phone;
		String pStatus;
		
		ExtPerson temp;
		
		infile = new BufferedReader(new FileReader("Project2Data.txt"));
		
		inputStr = infile.readLine();
		
		while(inputStr != null)
		{
			tokenizer = new StringTokenizer(inputStr);
			first = tokenizer.nextToken();
			last = tokenizer.nextToken();
			
			inputStr = infile.readLine();
			tokenizer = new StringTokenizer(inputStr);
			
			month = Integer.parseInt(tokenizer.nextToken());
			day = Integer.parseInt(tokenizer.nextToken());
			year = Integer.parseInt(tokenizer.nextToken());
			street = infile.readLine();
			city = infile.readLine();
			state = infile.readLine();
			zip = infile.readLine();
			phone = infile.readLine();
			pStatus = infile.readLine();
			
			temp = new ExtPerson();
			temp.setInfo(first,last, month, day, year, 
					street, city, state, zip, phone, pStatus);
			
			adBook.insert(temp);
			
			inputStr = infile.readLine();
		}
	}
	
	public static void saveData(AddressBook adBook) throws IOException,
									FileNotFoundException
	{
		PrintWriter outfile;
		
		String filename;
		
		System.out.println("Enter file name: ");
		System.out.flush();
		filename = keyboard.readLine();
		System.out.println();
		
		outfile = new PrintWriter(new FileWriter(filename));
		
		adBook.saveData(outfile);
	}
	
	public static void showMenu()
	{
		
		System.out.println();
		System.out.println();
		System.out.println("Welcome to the address book program.");
		System.out.println("Chose among the following options:");
		System.out.println("1:To see if a person is in the address book");
		System.out.println("2:Print the information of a person");
		System.out.println("3:Print the names of person having birthday in a particular month");
		System.out.println("4:Print the names of persons between two last names");
		System.out.println("5:Print the names of persons having a particular status");
		System.out.println("6:Print the address book");
		System.out.println("7:Save Data");
		System.out.println("8:Add a new person to the address book");
		System.out.println("9:Delete an existing person from the address book");
		System.out.println("10:Terminate the program");
	}
	

}
