package lab4;
 
public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String title;
	private String author;
	private boolean isAvailable; 
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	
	// TODO: implement Book functionality
	public void updateStatus(){
		if(isAvailable){
			isAvailable = false;
		}else{
			isAvailable = true;
		}
	}

	public String getTitle(){
		return this.title;
	}
	
	public boolean getStatus() {
		return isAvailable;
	}

	public String toString(){
		return title + ". " + author + ". Is Available: " + isAvailable;
	}

}
