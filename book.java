class Book{
	String Title,Author;
	final int bookID=0;
	static int bookCounter=1000;
	final static String library_Name="Central Library";
	int count;
	Book(){
		this.Title="Title";
		this.Author="Author";
	}
	Book( String Title,String name,String Author){
		this.Title=Title;
		this.Author=Author;
		bookCounter++;
	}
	public void displayInfo() {
		System.out.println("Title:");
		System.out.println("Author");
		System.out.println("bookID:");
	}
	public void displayInfo(boolean showlibrary) {
		if (showlibrary) {
			displayInfo();
			System.out.println("Library Name:" +library_Name);
		}
	}
	public static void DisplayTotalBooks() {
		System.out.println("Total Books:" +(bookCounter-1000));
	}
	
}
public class book {
	public static void main(String [] args) {
		Book book=new Book();
		Book.displayInfo();
		
	}
}