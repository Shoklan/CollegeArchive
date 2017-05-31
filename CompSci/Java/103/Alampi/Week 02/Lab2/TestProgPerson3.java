//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class TestProgPerson3
//           Due Date:  September 17, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to Test the class called
// Person3.  
//****************************************************************




public class TestProgPerson3
{
    public static void main(String[] args)
    {

        Person3 student = new Person3("Mary", "Beth", "Regan");    

        System.out.println(student);                             

        if(student.isLastName("Regan"))
              System.out.println("Student\'s last name is Regan");  
        else
              System.out.println("Student\'s last name is not Regan");



        if(student.isFirstName("Mary"))
              System.out.println("Student\'s first name is Mary");  
        else
              System.out.println("Student\'s first name is not Mary");
        
        

        Person3 student2 = new Person3();    
        student2.setLastName("Clinton");
        System.out.println();
        System.out.println("Student2\'s last name is " + student2.getLastName());

        if(student.isLastName(student2.getLastName()))
              System.out.println("Student2\'s last name is Regan");  
        else
              System.out.println("Student2\'s last name is not Regan");



        System.out.println();
        student2.setFirstName("Sally");
        System.out.println("Student2\'s first name is " + student2.getFirstName());
        if(student.isFirstName(student2.getFirstName()))
              System.out.println("Student2\'s first name is Mary");  
        else
              System.out.println("Student2\'s first name is not Mary");



        student2.setMiddleName("Hugo");
        System.out.println();
        System.out.println("Student2\'s middle name is " + student2.getMiddleName());
        System.out.println("Student2\'s name is " + student2);


        System.out.println();
        System.out.println();
        System.out.println();
        if(student.equals(student2))
              System.out.println("These two Student\'s have the same names");  
        else
              System.out.println("These two Student\'s have different names");
        


    }//end main
}