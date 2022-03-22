package lab4;
abstract class item{
	private double Id;
	private String title;
	private int copies;
	private static boolean Checkedin;
	item(double id, String title, int copies){
		this.Id=id;
		this.title=title;
		this.copies=copies;
	}
	public static void setCheckedin(boolean checkedin) {
		checkedin=checkedin;
	}
	public boolean isCheckedin() {
		return Checkedin;
	}
	
	public double getId() {
		return Id;
	}
	public void setId(double id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	
	
	
}
abstract class WrittenItem extends item{
	WrittenItem(double id, String title, int copies) {
		super(id, title, copies);
		// TODO Auto-generated constructor stub
	}

	private String author;
}
//////////////////////////////////////////////////////
class Book extends WrittenItem{

	Book(double id, String title, int copies) {
		super(id, title, copies);
		// TODO Auto-generated constructor stub
	}
	
}
///////////////////////////////////////////////
class JournalPaper extends WrittenItem{
	private int year;

	JournalPaper(double id, String title, int copies) {
		super(id, title, copies);
		// TODO Auto-generated constructor stub
	}
	
}
//////////////////////////////////////////
abstract class Mediaitem extends item{
	private int runtime;

	Mediaitem(double id, String title, int copies) {
		super(id, title, copies);
		// TODO Auto-generated constructor stub
	}
	
}
////////////////////////////////////////

class Vedio extends Mediaitem{
	private String director;
	private String genre;
	private int pub_year;

	Vedio(double id, String title, int copies) {
		super(id, title, copies);
		
	}
	
}
////////////////////////////////////////
class CD extends Mediaitem{
	private String artist;
	private String genre;

	CD(double id, String title, int copies) {
		
		super(id, title, copies);
		// TODO Auto-generated constructor stub
	}
	
}


public class Exercise3 {
	

}
