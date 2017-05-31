//************************************************
//           Name: John Alampi
//           Course:  CSC 101
//           Instructor:  John Alampi
//           Lecture  Week 11  Sorts
//           Due Date:  April 27, 2011
//
//************************************************
//********************************************************************
//  Sorts.java       Author: Lewis and Loftus
//
//  Demonstrates the selection sort and insertion sort algorithms,
//  as well as a generic object sort.
//********************************************************************

public class Sorts
{
   //---------------------------------------
   //   CONSTANTS
   //---------------------------------------


   //---------------------------------------
   //   VARIABLES
   //---------------------------------------


   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using the selection
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static void selectionSort (int[] numbers)
   {
      //---------------------------------------
      //   CONSTANTS
      //---------------------------------------

      //---------------------------------------
      //   VARIABLES
      //---------------------------------------
      int min, temp;

      for (int index = 0; index < numbers.length-1; index++)  // inefficient code
      {
         min = index;
         for (int scan = index+1; scan < numbers.length; scan++)   // inefficient code
            if (numbers[scan] < numbers[min])
               min = scan;

         // Swap the values
         temp = numbers[min];
         numbers[min] = numbers[index];
         numbers[index] = temp;
      }
   }

   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static void insertionSort (int[] numbers)
   {
      for (int index = 1; index < numbers.length; index++)
      {
         //---------------------------------------
         //   VARIABLES
         //---------------------------------------
         int key = numbers[index];
         int position = index;

         // shift larger values to the right
         while (position > 0 && numbers[position-1] > key)
         {
            numbers[position] = numbers[position-1];
            position--;
         }
            
         numbers[position] = key;
      }
   }

   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   //@SuppressWarnings("unchecked")
   public static void insertionSort (Comparable[] objects)
   {
      for (int index = 1; index < objects.length; index++)
      {
         //---------------------------------------
         //   VARIABLES
         //---------------------------------------

         Comparable key = objects[index];
         int position = index;

         // shift larger values to the right
         //  sorts by contacts by lastname; if two contacts have the same last name
         //  their first names are used  (instructor page 272  & 292-296 Lewis)
         while (position > 0 && objects[position-1].compareTo(key) > 0)
         {
            objects[position] = objects[position-1];
            position--;
         }
            
         objects[position] = key;
      }
   }
}
