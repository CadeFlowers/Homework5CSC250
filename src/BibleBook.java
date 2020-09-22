public class BibleBook
{
	private String BookName;
	private int NumOfChapters;
	private String Summary;
	
	public BibleBook(String BookName, int NumOfChapters, String Summary) 
	{
		this.BookName = BookName;
		this.NumOfChapters = NumOfChapters;
		this.Summary = Summary;		
	}
	
	public void display() 
	{
		System.out.println("Book Name: " + this.BookName + " // Number of Chapters: " + this.NumOfChapters + " // Summary: " + this.Summary);		
	}
}
