//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class TestProgPerson6
//           Due Date:  September 17, 2009
//************************************************
//****************************************************************
// The purpose of this program is to Test the class called
// Person with the new method getCopy and Copy constructor.  
//****************************************************************




public class TestProgPerson6
{
    public static void main(String[] args)
    {

        Person student = new Person("Mary", "Beth", "Regan");    

        System.out.println(student);                             

        if(student.isLastName("Regan"))
              System.out.println("Student\'s last name is Regan");  
        else
              System.out.println("Student\'s last name is not Regan");



        if(student.isFirstName("Mary"))
              System.out.println("Student\'s first name is Mary");  
        else
              System.out.println("Student\'s first name is not Mary");
        
        

        Person student2 = new Person();    
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
        if(student.equals(student2))
              System.out.println("These two Student\'s have the same names");  
        else
              System.out.println("These two Student\'s have different names");
        

       student2.makeCopy(student);
       System.out.println();
       System.out.println();
       System.out.println();

       System.out.println("We just called the new makeCopy method");
        if(student.equals(student2))
              System.out.println("These two Student\'s have the same names");  
        else
              System.out.println("These two Student\'s have different names");

       System.out.println("Student2\'s new name is " + student);



       Person temp;
       temp=student.getCopy();
       System.out.println();
       System.out.println();
       System.out.println();

       System.out.println("We just called the new getCopy method");

       System.out.println("Temp\'s new name is " + temp);


       System.out.println();

       student2.setLastName("Astor");
       student2.setFirstName("John");
       student2.setMiddleName("Jacob");
       System.out.println("We just changed student2\'s name to " + student2);      
       System.out.println("student1\'s name is " + student);      

       System.out.println("We just called the Copy constructor to copy student2 to student3");

       Person student3 = new Person(student2);
       System.out.println("Student3\'s new name is " + student3); 
       




    }//end main
}