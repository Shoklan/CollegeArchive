//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class ListedListEx_1
//           Due Date:  September 24, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to implement the class called
// IntElement.  
//****************************************************************

//Test Program Integer LinkedListClass And UnorderedLinkedList

import java.io.*;
import java.util.*;

public class LinkedListEx_1
{
        
    public static void main(String[] args) throws IOException
    {
        // Used to Read data from the input file
        FileReader fr = new FileReader ("Lab4Test1.txt");                 // Opens the file
        BufferedReader inFile = new BufferedReader (fr);


        // Used to Read data from the command line
        BufferedReader stdin = new BufferedReader
	(new InputStreamReader(System.in));

        UnorderedLinkedList list1
                          = new UnorderedLinkedList();              //Line 1
        UnorderedLinkedList list2 =
                            new UnorderedLinkedList();              //Line 2

        IntElement num = new IntElement();                          //Line 3

        int counter=0;                                              //Line 4
        int position=0;                                             //Line 5
        
        String line;

        StringTokenizer tokenizer;                                  //Line 6

        System.out.println("Line 7: Processing the "
                         + "integer list");                         //Line 7
        System.out.println(" ");                                    //Line 8
 
        System.out.flush();                                         

         line = inFile.readLine();                                  //Line 9

         while (line != null)				            //Line 10		
         {
            tokenizer = new StringTokenizer (line);		    //Line 11
            num.setNum(Integer.parseInt(tokenizer.nextToken()));    //Line 12
            list1.insertFirst(num);                                 //Line 13
            counter++;
            line = inFile.readLine();
         }

         inFile.close();  // Closes the file



        System.out.println();                                       //Line 14
       
        System.out.println("Line 15: list1: ");                     //Line 15
        list1.print();                                              //Line 16
        System.out.println();                                       //Line 17
        System.out.println("Line 18: Length of list1: "               
                         + list1.length());                         //Line 18

        list2.copyList(list1);                                      //Line 19
        System.out.println("Line 20: list2: ");                     //Line 20
        list2.print();                                              //Line 21
        System.out.println();                                       //Line 22
        System.out.println("Line 25: Length of list2: "               
                         + list2.length());                         //Line 25


        System.out.print("Line 26: Enter the number to "
                       + "be deleted : ");                          //Line 26
        System.out.flush();                                         //Line 27
        num.setNum(Integer.parseInt(stdin.readLine()));             //Line 28
        System.out.println();                                       //Line 29

        list2.deleteNode(num);                                      //Line 30

        System.out.println("Line 31: After deleting "
                          + "the node, list2: ");                   //Line 31
        list2.print();                                              //Line 32
        System.out.println();                                       //Line 33

        System.out.println("Line 34: Length of list2: "               
                         + list2.length());                         //Line 34
        System.out.println();                                       //Line 35

        System.out.println("Line 36: list1: ");                     //Line 36
        list1.print();                                              //Line 37
        System.out.println();                                       //Line 38
        System.out.println("Line 39: Length of list1: "               
                         + list1.length());                         //Line 39

        System.out.println();                                       
        System.out.print("Line 40: Enter the number to "
                       + "be searched for in list2 : ");            //Line 40
        System.out.flush();                                         //Line 41
        num.setNum(Integer.parseInt(stdin.readLine()));             //Line 42
        System.out.println();                                       //Line 43

        boolean found = list2.search(num);                          //Line 44
        if(found==true)						    //Line 45
          System.out.println(num +" was in list2");                 //Line 46
        else							    //Line 47
          System.out.println(num +" was NOT in list2");             //Line 48
    }
}

