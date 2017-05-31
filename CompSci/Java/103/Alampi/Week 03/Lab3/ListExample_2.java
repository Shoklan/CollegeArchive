//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class ListExample_2
//           Due Date:  September 24, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to implement the class called
// IntElement.  
//****************************************************************

//Test Program Integer Array List

import java.io.*;
import java.util.*;

public class ListExample_2
{
        
    public static void main(String[] args) throws IOException
    {
        // Used to Read data from the input file
        FileReader fr = new FileReader ("String.txt");               // Opens the file
        BufferedReader inFile = new BufferedReader (fr);


        // Used to Read data from the command line
        BufferedReader stdin = new BufferedReader
	(new InputStreamReader(System.in));

        UnorderedArrayList stringList
                          = new UnorderedArrayList(50);             //Line 1
        UnorderedArrayList tempList =
                            new UnorderedArrayList();               //Line 2

        StringElement strObject = new StringElement();              //Line 3

        int counter=0;                                              //Line 4
        int position=0;                                             //Line 5
        
        String line;

        StringTokenizer tokenizer;                                  //Line 6

        System.out.println("Line 7: Processing the "
                         + "String list");                          //Line 7
        System.out.println(" ");                                    //Line 8
 
        System.out.flush();                                         //Line 9

         line = inFile.readLine();
         while (line != null)				            //Line 10		
         {
            tokenizer = new StringTokenizer (line);		    //Line 11
            while (tokenizer.hasMoreTokens()) 
            {
              strObject.setString(tokenizer.nextToken());           //Line 12
              stringList.insert(strObject);                         //Line 13
              counter++;
           }
            line = inFile.readLine();
         }

         inFile.close();  // Closes the file








        tempList.copyList(stringList);                              //Line 14

        System.out.println();                                       //Line 15
        System.out.print("Line 16: The " + counter + " "
                       + "Strings from the file are: ");            //Line 16
        stringList.print();                                         //Line 17
        System.out.println();                                       //Line 18

        System.out.print("Line 19: Enter the item to "
                       + "be deleted: ");                           //Line 19
        System.out.flush();                                         //Line 20
        strObject.setString(stdin.readLine());                      //Line 21
        System.out.println();                                       //Line 22

        stringList.remove(strObject);                               //Line 23
        System.out.println("Line 24: After removing "
                          + strObject
                          + " the list is:");                       //Line 24
        stringList.print();                                         //Line 25
        System.out.println();                                       //Line 26

        System.out.print("Line 27: Enter the position of "
                       + "the item to be deleted: ");               //Line 27
        System.out.flush();                                         //Line 28

        position = Integer.parseInt(stdin.readLine());              //Line 29
        System.out.println();                                       //Line 30

        stringList.removeAt(position);                              //Line 31
        System.out.println("Line 32: After removing the "
                          + "element at position "
                          + position
                          + ", stringList:");                       //Line 32

        stringList.print();                                         //Line 33
        System.out.println();                                       //Line 34

        System.out.print("Line 35: Enter the search "
                        +  "item: ");                               //Line 35
        System.out.flush();                                         //Line 36

        strObject.setString(stdin.readLine());                      //Line 37
        System.out.println();                                       //Line 38

        if(stringList.seqSearch(strObject) != -1)                   //Line 39
           System.out.println("Line 40: Item found in "
                            + "the list");                          //Line 40
        else                                                        //Line 41
           System.out.println("Line 42: Item not found");           //Line 42

        System.out.print("List 43: The templist : ");               //Line 43
        tempList.print();                                           //Line 44
        System.out.println();                                       //Line 45
    }
}

