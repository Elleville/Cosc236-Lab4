package lab4;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:
	private ArrayList<Book> availableBooks = new ArrayList<>();
	private ArrayList<Member> members = new ArrayList<>();

	// DONE: implement functionality of Member class

	 // Show the available books in the library (un-implemented)
	 public void showAvailableBooks() {
		System.out.println("Available Books:");
		for (Book book : availableBooks) {
			if(book.getStatus()) {
				System.out.println(book.getTitle());
			}
		}
	}

	// Show members of in the library (un-implemented)
	public void showMembers() {
		System.out.println("Library members:");
		for (Member member : members) {
			System.out.println(member);
		}
	}
	
	public Book findBookByTitle(String bookTitle) {
		for(Book book : availableBooks) {
			if(book.getTitle() == bookTitle) {
				return book;
			}
		}
		System.out.println("The Book " + bookTitle + " does not exist");
		return null;
	}

	public Member findMemberByName(String memberName){
		for(Member member : members) {
			if(member.getName() == memberName) {
				return member;
			}
		}
		System.out.println("The memeber " + memberName + " does not exist");
		return null;
	}

	// Adds a book to the library catalog (un-implemented)
	public void addBook(Book b) {
		availableBooks.add(b);
		System.out.println(b.getTitle() + " has been added to the catalog.");
	}

	public void borrowBook(Book b){
		int indexOfBook = availableBooks.indexOf(b);
		System.out.println(b.getTitle() + " has been borrowed");
	
	}
	
	public void returnBook(Book b) {
		int indexOfBook = availableBooks.indexOf(b);
		System.out.println(b.getTitle() + " has been returned");
	
	}
	
	public int findBookIndex(String bookTitle){
		return availableBooks.indexOf(findBookByTitle(bookTitle));
	}

	 // Adds a new member to the library (without a separate class) (Un-implemented)
 	public void addMember(String memberName) {
 		//check if member already exists
		if (!members.contains(memberName)) {
			//check if members list is empty
			if(members.isEmpty()) {
				members.add(new Member(1, memberName));
			}else {
				//create a new member with id +1 of the previous member
				int id = members.get(members.size()-1).getID() + 1;
				members.add(new Member(id, memberName));
			}
			System.out.println("Member " + memberName + " has been added.");
		} else {
			System.out.println("Member " + memberName + " already exists.");
     		}
 	}
 	
 	public ArrayList<Member> getMembers() {
 		return this.members;
 	}
 	
 	public ArrayList<Book> getAvailableBooks() {
 		return this.availableBooks;
 	}
}
