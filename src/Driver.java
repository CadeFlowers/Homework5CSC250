public class Driver 
{
	public static void main(String[] args)
	{		
		BibleBook A = new BibleBook("Matthew", 28, "the gospel of Jesus");
		BibleBook B = new BibleBook("Mark", 16, "Ministry of Jesus");
		BibleBook C = new BibleBook("Luke", 24, "It tells of the origins, birth, ministry, death, resurrection, and ascension of Jesus Christ");
		A.display();
		B.display();
		C.display();
		
		
	}
}
