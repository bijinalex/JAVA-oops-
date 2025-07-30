package java_lab_projects;
	
	class Book{
		String title;
		String author;
		double price;
		int quantity;
		float totalvalue;
	
	Book(String Title,String Author,double price,int quantity){
		this.title=Title;
		this.author=Author;
		this.price=price;
		this.quantity=quantity;
		}
	
	public void TotalValue() {
		totalvalue= (float) (price * quantity);			}

	
 public void displayDetails(){
	System.out.println("Title:"+title);
	System.out.println("Author:"+author);
	System.out.println("Price:"+ price);
	System.out.println("Quantity:"+ quantity);
	System.out.println("TotalValue:"+ totalvalue);
	}
  }
	
public class BookDetails {
	public static void main(String[] args) {
		System.out.println("Book 1 Details:\n");
		Book b1=new Book("The Eye","Chris.H",390,1);
		b1.TotalValue();
		b1.displayDetails();
		
		System.out.println("\n");
		
		System.out.println("Book 2 Details:\n");
		Book b2=new Book("Marcus","Evan.S.T",500,2);
		b2.TotalValue();
		b2.displayDetails();
	}
}
