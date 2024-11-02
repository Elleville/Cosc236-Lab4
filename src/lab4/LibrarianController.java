package lab4;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// DONE: implement functionality of Member class
	private Library library;
	
	public LibrarianController(Library library) {
		this.library = library;
	}

	// Borrow a book from the library (Un-implemented)
	public void borrowBook(String bookTitle, String memberName) {
		Book book = library.findBookByTitle(bookTitle);
		Member member = library.findMemberByName(memberName);
		
		if (!library.getMembers().contains(member)) {
			System.out.println("Member " + member.getName() + " not found.");
			return;
		}

		if (library.getAvailableBooks().contains(book) && book.getStatus()) {
			library.borrowBook(book);  //send to library
			member.addBook(book); //send to member
			book.updateStatus(); //send to book
			System.out.println(member.getName() + " has successfully borrowed " + book.getTitle());
		} else {
			System.out.println(book.getTitle() + " is either already borrowed or not available.");
		}
	}

	// Return a book to the library (Un-implemented)
	public void returnBook(String bookTitle, String memberName) {
		Book book = library.findBookByTitle(bookTitle);
		Member member = library.findMemberByName(memberName);
		
		if (!library.getMembers().contains(member)) {
			System.out.println("Member " + member.getName() + " not found.");
			return;
		}

		if (member.getBooks().contains(book)) {
			member.removeBook(book); //send to member
			library.returnBook(book);   //send to library
			book.updateStatus(); //send to book
			System.out.println(member.getName() + " has successfully returned " + book.getTitle());
		} else {
			System.out.println(member.getName() + " didn't borrow " + book.getTitle());
		}
	}

}
