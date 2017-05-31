//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class Lab9Part1
//           Due Date:  November 5, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to Test the class called
// OrderedArrayList.  
//****************************************************************

import java.io.*;
import java.util.*;

public class Lab9Part1
{
    static BufferedReader keyboard = new
           BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        OrderedArrayList intList
                          = new OrderedArrayList(50);

        IntElement num = new IntElement();
        int counter;
        int position;

        StringTokenizer tokenizer;

        System.out.println("Processing the integer list");
        System.out.print("Enter 8 integers in the same line: ");
        System.out.flush();

        tokenizer = new
                   StringTokenizer(keyboard.readLine());

        for(counter = 0; counter < 8; counter++)
        {
           num.setNum(Integer.parseInt(tokenizer.nextToken()));
           intList.insert(num);
        }

        System.out.println();
        System.out.print("The list you entered is: ");
        intList.print();
        System.out.println();

        System.out.print("Enter the search item: ");
        System.out.flush();

        num.setNum(Integer.parseInt(keyboard.readLine()));
        System.out.println();
        if(intList.seqSearch(num) != -1)
           System.out.println("Item found in the list");
        else
           System.out.println("Item not found");
    }
}

