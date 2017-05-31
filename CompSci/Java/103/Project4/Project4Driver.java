//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class Project4Driver
//           Due Date:  Dec 17, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to implement the class called
// Project4Driver.  
//****************************************************************

import java.io.*;

public class Project4Driver
{
    static BufferedReader keyboard = new
           BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args)
    {
        VideoBinaryTree  videoList = new VideoBinaryTree();
        int choice;
        String title;

        try
        {
            BufferedReader infile = new
                 BufferedReader(new FileReader("videoDat.txt"));

            createVideoList(infile, videoList);

            displayMenu();
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(keyboard.readLine());
            System.out.println();

            while(choice != 9)
            {
                switch(choice)
                {
                case 1: System.out.print("Enter the title: ");
                        title = keyboard.readLine();
                        System.out.println();
                        if(videoList.videoSearch(title))
                            System.out.println("Title found");
                        else
                            System.out.println("This video not in "
                                             + "the store.");
                        break;
                case 2: System.out.print("Enter the title: ");
                        title = keyboard.readLine();
                        System.out.println();
                        if(videoList.videoSearch(title))
                        {
                            if(videoList.isVideoAvailable(title))
                            {
                                videoList.videoCheckOut(title);
                                System.out.println("Enjoy your movie: "
                                                + title);
                            }
                            else
                                System.out.println("Currently " + title
                                           + " is out of stock.");
                        }
                        else
                            System.out.println("The store does not "
                                            + "carry " + title);
                        break;
                case 3: System.out.print("Enter the title: ");
                        title = keyboard.readLine();
                        System.out.println();
                        if(videoList.videoSearch(title))
                        {
                            videoList.videoCheckIn(title);
                            System.out.println("Thanks for returning "
                                          + title);
                        }
                        else
                            System.out.println("This video is not "
                                         + "from our store.");
                        break;
                case 4: System.out.print("Enter the title: ");
                        title = keyboard.readLine();
                        System.out.println();
                        if(videoList.videoSearch(title))
                        {
                            if(videoList.isVideoAvailable(title))
                                System.out.println(title
                                          + " is currently in stock.");
                            else
                                System.out.println(title +
                                               " is not in the store.");
                        }
                        else
                            System.out.println(title + " is not "
                                               + "from this store.");
                    break;
                case 5: videoList.videoPrintTitle();
                        break;
                case 6: videoList.inorderTraversal();
                        break;
                default: System.out.println("Invalid selection");
                }//end switch

                displayMenu();
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(keyboard.readLine());
                System.out.println();
            }//end while
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println(fnfe.toString());
        }
        catch(IOException ioe)
        {
            System.out.println(ioe.toString());
        }
    }

    public static void createVideoList(BufferedReader infile,
                                       VideoBinaryTree videoList)
                                       throws IOException
    {
        String  Title;
        String  Star1;
        String  Star2;
        String  Producer;
        String  Director;
        String  ProductionCo;
        int   InStock;

        VideoElement newVideo = new VideoElement();

        Title = infile.readLine();

        while(Title != null)
        {
            Star1 = infile.readLine();
            Star2 = infile.readLine();
            Producer = infile.readLine();
            Director = infile.readLine();
            ProductionCo = infile.readLine();
            InStock = Integer.parseInt(infile.readLine());
            newVideo.setVideoInfo(Title,Star1,Star2,Producer,
                                Director,ProductionCo,InStock);
            videoList.insert(newVideo);

            Title = infile.readLine();
        }//end while
    }//end createVideoList

   public static void displayMenu()
   {
       System.out.println("Select one of the following: ");
       System.out.println("1: To check whether a particular "
                            + "video is in the store");
       System.out.println("2: To check out a video");
       System.out.println("3: To check in a video");
       System.out.println("4: Check whether a particular video "
                            + "is in stock");
       System.out.println("5: To print the titles of all " 
                            + "the videos");
       System.out.println("6: To print a list of all " 
                            + "the videos");
       System.out.println("9: To exit");
   }
}
