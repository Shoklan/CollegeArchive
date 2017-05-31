//******************************************************************************************************************************************
//	Author: Collin Mitchell
//	Course: Computer Science 103
//	Instructor: John Alampi
//	Class: VideoElement.java
//	Due Date: December 3rd, 2009
//*******************************************************************************************************************************************
// The purpose of this class is to extend DataElement. This class uses the listed instance variables to store information about a video
// used by a rental store program. This class has seven instance variables, two constructors, and 15 methods.
//*******************************************************************************************************************************************
public class VideoElement extends DataElement
{
	//---------------------------------------------------------------------------------------------------------------------------------------
	//Instance Variables
	//---------------------------------------------------------------------------------------------------------------------------------------
	private String videoTitle;
	private String movieStar1;
	private String movieStar2;
	private String movieProducer;
	private String movieDirector;
	private String movieProductionCo;
	private int copiesInStock;
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//	Default Constructor
	//	Instance Variables are initialized to default values.
	//	Postconditiion: videoTitle = ""; movieStar1 = ""; movieStar2 = "";
	//				movieProducer = ""; movieDirector = ""; movieProductionCo = "";
	//					copiesInStock = 0;
	//---------------------------------------------------------------------------------------------------------------------------------------
	public VideoElement()
	{
		setVideoInfo("", "", "", "", "", "", 0);
	}//End of Default Constructor
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//	Constructor with parameters
	//	Instance Variables are set according to the parameters
	//	Postconditiion: videoTitle = title; movieStar1 = star1; movieStar2 = star2; movieProducer = producer; movieDirector = director;
	//	movieProductionCo = productionCo; copiesInStock = setInStock;
	//---------------------------------------------------------------------------------------------------------------------------------------
	public VideoElement(String title, String star1, String star2, String producer, String director, String productionCo, int setInStock)
	{
		setVideoInfo(title, star1, star2, producer, director, productionCo, setInStock);
	}//End of Constructor with Parameters
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//	Method to set the details of a video.
	//	Instance Variables are set according to parameters.
	//	Postconditiion: videoTitle = title; movieStar1 = star1; movieStar2 = star2; movieProducer = producer; movieDirector = director;
	//	movieProductionCo = productionCo; copiesInStock = setInStock;
	//---------------------------------------------------------------------------------------------------------------------------------------
	public void setVideoInfo(String title, String star1, String star2, String producer, String director, String productionCo, int setInStock)
	{
		videoTitle = title;
		movieStar1 = star1;
		movieStar2 = star2;
		movieProducer = producer;
		movieDirector = director;
		movieProductionCo = productionCo;
		copiesInStock = setInStock;
	}//End of method setVideoinfo
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//	Method to check the number of copies in stock.
	//	Postcondition: The value of the instance Variable compiesInStock is returned.
	//---------------------------------------------------------------------------------------------------------------------------------------
	public int getNoOfCopiesInStock()
	{
		return copiesInStock;
	}//End of method getNoOfCopiesInStock
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//	Method to check in a video.
	//	Postcondition: THe number of copies in stock is incremented by one.
	//---------------------------------------------------------------------------------------------------------------------------------------
	public void checkIn()
	{
		copiesInStock++;
	}//End of method checkIn
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//	Method to rent a video.
	//	Postcondition: If there is a video in stock, it's number of copies in stock is decremented by one; otherwise, the message
	//					"Currently out of Stock" is printed.
	//---------------------------------------------------------------------------------------------------------------------------------------
	public void checkOut()
	{
		if(copiesInStock > 0)
			copiesInStock--;
		else
			System.out.println("Currently Out of Stock.");
	}//End of method checkOut
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	//	Method to print the title of a movie.
	//----------------------------------------------------------------------------------------------------------------------------------------
	public void printTitle()
	{
		System.out.println("Video Title: " + videoTitle);
	}//End of method printTitle
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	//	Method to print the details of a video.
	//	Postcondition: The title of the movie, stars, director, and so on are displayed to the screen.
	//----------------------------------------------------------------------------------------------------------------------------------------
	public void printInfo()
	{
		System.out.println("Video Title: " + videoTitle);
		System.out.println("Stars: " + movieStar1 + " and " + movieStar2);
		System.out.println("Producer: " + movieProducer);
		System.out.println("Director: " + movieDirector);
		System.out.println("Production Company: " + movieProductionCo);
		System.out.println("Copies In Stock: " + copiesInStock);
		System.out.println();
	}//End of method printInfo
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	//	Method to return the video info as a string.
	//----------------------------------------------------------------------------------------------------------------------------------------
	public String toString()
	{
		return("Video Title: " + videoTitle + "\n" + "Stars: " + movieStar1 + " and " + movieStar2 + "\n" +
			"Producer: " + movieProducer + "\n" + "Director: " + movieDirector + "\n" + "Production Company: " + movieProductionCo +
			"\n" + "Copies In Stock: " + copiesInStock + "\n\n");
	}//End of method toString()
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	//	Method to determine if title is the same as the title of the video.
	//	Postcondition: Returns the value true if the title is the same as the title of the video; false otherwise.
	//----------------------------------------------------------------------------------------------------------------------------------------
	public boolean checkTitle(String title)
	{
		return(videoTitle.compareTo(title) == 0);
	}//End of method CheckTitle
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	//	Method to increment the number of copes in stock by  adding the value of num.
	//	Postcondition: copiesInStock += num;
	//----------------------------------------------------------------------------------------------------------------------------------------
	public void updateInStock(int num)
	{
		copiesInStock += num;
	}//End of method updateInStock
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	//	Method to set the number of copies in stock.
	//	Postcondition: copiesInStock = num;
	//----------------------------------------------------------------------------------------------------------------------------------------
	public void setCopiesInStock(int num)
	{
		copiesInStock = num;
	}//End of method setCopiesInStock
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	//	Returns title of the video
	//	Postcondition: The value of the instance variable videoTitle is returned.
	//----------------------------------------------------------------------------------------------------------------------------------------
	public String getTitle()
	{
		return videoTitle;
	}//End of method getTitle
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	//	Equals Abstract Method
	//----------------------------------------------------------------------------------------------------------------------------------------
	public boolean equals(DataElement otherElement)
	{
		VideoElement temp = (VideoElement) otherElement;
		return (videoTitle.compareTo(temp.videoTitle) == 0 && movieStar1.compareTo(temp.movieStar1) == 0 && movieStar2.compareTo(temp.movieStar2) == 0 &&
			movieProducer.compareTo(temp.movieProducer) == 0 && movieDirector.compareTo(temp.movieDirector) == 0 &&
			movieProductionCo.compareTo(temp.movieProductionCo) == 0);
	}//End of abstract method equals
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	//	CompareTo Abstract Method
	//----------------------------------------------------------------------------------------------------------------------------------------
	public int compareTo(DataElement otherElement)
	{
		VideoElement temp = (VideoElement) otherElement;
		return (videoTitle.compareTo(temp.videoTitle));
	}//End of Method compareTo
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	//	makeCopy Abstract Method
	//----------------------------------------------------------------------------------------------------------------------------------------
	public void makeCopy(DataElement otherElement)
	{
		VideoElement temp = (VideoElement) otherElement;
		videoTitle = temp.videoTitle;
		movieStar1 = temp.movieStar1;
		movieStar2 = temp.movieStar2;
		movieProducer = temp.movieProducer;
		movieDirector = temp.movieDirector;
		movieProductionCo = temp.movieProductionCo;
		copiesInStock = temp.copiesInStock;
	}//End of method makeCopy
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	//	getCopy Abstract Method
	//----------------------------------------------------------------------------------------------------------------------------------------
	public DataElement getCopy()
	{
		VideoElement temp = new VideoElement(videoTitle, movieStar1, movieStar2, movieProducer, movieDirector, movieProductionCo, copiesInStock);
		return temp;
	}//End of method getCopy
}//End of class Video Element