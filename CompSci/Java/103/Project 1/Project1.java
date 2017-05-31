import java.io.*;
import java.util.*;

public class Project1
{
    static BufferedReader keyboard = new
        BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        AddressBook addressBook = new AddressBook();
        String str;
        String str1;
        String str2;
        int choice;
        int loc;
        int month;

        loadAddressBook(addressBook);

        showMenu();

        choice = Integer.parseInt(keyboard.readLine());

        while(choice != 9)
        {
            switch(choice)
            {
                case 1: System.out.print("Enter the last name of the person: ");
                        System.out.flush();
                        str = keyboard.readLine();
                        System.out.println();

                        loc = addressBook.search(str);

                        if(loc != -1)
                            System.out.println(str + " in the address book");
                        else
                            System.out.println(str + " is not in the address book");

                        break;
                case 2: System.out.print("Enter the last name of the person: ");
                        System.out.flush();
                        str = keyboard.readLine();
                        System.out.println();

                        loc = addressBook.search(str);

                        if(loc != -1)
                            addressBook.printAt(loc);
                        else
                            System.out.println(str + " is not in the address book");
                        break;

                case 3: System.out.print("Enter the month number: ");
                        System.out.flush();
                        month = Integer.parseInt(keyboard.readLine());
                        System.out.println();

                        addressBook.printNameInTheMonth(month);
                        break;

                case 4: System.out.print("Enter starting last name: ");
                        System.out.flush();
                        str1 = keyboard.readLine();
                        System.out.println();

                        System.out.print("Enter ending last name: ");
                        System.out.flush();
                        str2 = keyboard.readLine();
                        System.out.println();

                        addressBook.printNamesBetweenLastNames(str1, str2);
                        break;

                case 5: System.out.print("Enter person type Family, Friend, Business: ");
                        System.out.flush();
                        str = keyboard.readLine();
                        System.out.println();

                        addressBook.printNamesWithStatus(str);
                        break;

                case 6: addressBook.print();
                        break;

                default: System.out.println("Invalid choice");
            }


            showMenu();
            choice = Integer.parseInt(keyboard.readLine());
        }

    } // End of Main

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

        infile = new BufferedReader(new FileReader("G:\\CSC 103\\Project1\\Project1Data.txt"));
        int i = 0;

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
            temp.setInfo(first, last, month, day, year, street, city, state, zip, phone, pStatus);

            adBook.insert(temp);
            i++;

            inputStr = infile.readLine();
        }
    }

    public static void showMenu()
    {
        System.out.println();
        System.out.println();
        System.out.println("Welcome to the address book program.");
        System.out.println("Choose among the following options:");
        System.out.println("1: To see if a person is in the address book");
        System.out.println("2: Print the information of a person");
        System.out.println("3: Print the names of person having birthday in a particular month");
        System.out.println("4: Print the names of persons between two last names");
        System.out.println("5: Print the names of persons having a particular status");
        System.out.println("6: Print the address book");
        System.out.println("9: Terminate the program");
    }
}