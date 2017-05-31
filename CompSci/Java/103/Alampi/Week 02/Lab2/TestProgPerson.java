//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class TestProgPerson
//           Due Date:  September 17, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to Test the class called
// Person.  
//****************************************************************




public class TestProgPerson
{
    public static void main(String[] args)
    {
        Person name = new Person();                    //Line 1

        Person emp = new Person("Donald", "Doc");      //Line 2

        System.out.println("Line 3: name: " + name);   //Line 3

        name.setName("Sleeping", "Beauty");            //Line 4
        System.out.println("Line 5: name: " + name);   //Line 5

        System.out.println("Line 6: emp: " + emp);     //Line 6

        emp.setName("Sandy", "Smith");                 //Line 7
        System.out.println("Line 8: emp: " + emp);     //Line 8
    }//end main
}