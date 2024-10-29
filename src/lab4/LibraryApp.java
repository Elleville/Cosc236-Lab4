package lab4;
//Simplified verion of Library Management System

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class LibraryApp {

public static void main(String[] args) {
	
	Library library = new Library();
	LibrarianController controller = new LibrarianController(library);
	
	Book dune = new Book("Dune", "Frank Herbert");
	Book nineteenEightyFour = new Book("1984","George Orwell");
	Book mobyDick = new Book("Mobey Dick", "Herman Milville");
	
	System.out.println(" *** Library management system demo *** ");
	
	library.addBook(dune);
	library.addBook(nineteenEightyFour);
	library.addBook(mobyDick);
	System.out.println();
	library.showAvailableBooks();
	
	System.out.println();
	
	library.addMember("Alice");
	library.addMember("Bob");
	System.out.println();
	library.showMembers();
	

	// Borrow a book
	System.out.println("\n *** Alice borrows Dune:");
	controller.borrowBook("Dune", "Alice");

	// Show available books after borrowing
	System.out.println("\n *** Show all books:");
	library.showAvailableBooks();

	System.out.println("\n *** Bob borrows 1984:");
	controller.borrowBook("1984", "Bob");

	// Show available books after borrowing
	System.out.println("\n *** Show all books:");
	library.showAvailableBooks();

	System.out.println("\nBob borrows Dune:");
	controller.borrowBook("Dune", "Bob");

	// Show available books after borrowing
	System.out.println("\n *** Show all books:");
	library.showAvailableBooks();

	// Return a book
	System.out.println("\n *** Alice returns Dune:");
	controller.returnBook("Dune", "Alice");

	// Show available books after returning
	System.out.println("\n *** Show all books:");
	library.showAvailableBooks();

	System.out.println("\n *** Bob borrows Dune:") ;
	controller.borrowBook("Dune", "Bob");

	// Show available books after borrowing
	System.out.println("\n *** Show all books:");
	library.showAvailableBooks();
	
	
	
	
	}
}

/*  System.out.println(" *** Library management system demo *** ");

// Adding some books to the catalog
System.out.println("\n *** Adding \"Dune\" to the library:");
library.addBook("Dune");

System.out.println("\n *** Adding \"1984\" to the library:");
library.addBook("1984"); 

System.out.println("\n *** Adding \"Moby Dick\" to the library:");
library.addBook("Moby Dick");

// Show available books
System.out.println("\n *** Show all books:");
library.showAvailableBooks();

// Adding members
System.out.println("\n *** Adding \"Alice\" to the library members");
library.addMember("Alice");

System.out.println("\n *** Adding \"Bob\" to the library members");
library.addMember("Bob");

// Show members
System.out.println("\n *** Show all members");
library.showMembers();
*/

 /* // Adds a new member to the library (without a separate class)
 public void addMember(String memberName) {
     if (!memberBorrowedBooks.containsKey(memberName)) {
         memberBorrowedBooks.put(memberName, new ArrayList<>());
         System.out.println("Member " + memberName + " has been added.");
     } else {
         System.out.println("Member " + memberName + " already exists.");
     }
 } */


/*  // Borrow a book from the library
 public void borrowBook(String bookName, String memberName) {
     if (!memberBorrowedBooks.containsKey(memberName)) {
         System.out.println("Member " + memberName + " not found.");
         return;
     }

     if (availableBooks.contains(bookName)) {
         availableBooks.remove(bookName);
         memberBorrowedBooks.get(memberName).add(bookName);
         System.out.println(memberName + " has successfully borrowed " + bookName);
     } else {
         System.out.println(bookName + " is either already borrowed or not available.");
     }
 } */


 /* // Return a book to the library
 public void returnBook(String bookName, String memberName) {
     if (!memberBorrowedBooks.containsKey(memberName)) {
         System.out.println("Member " + memberName + " not found.");
         return;
     }

     if (memberBorrowedBooks.get(memberName).contains(bookName)) {
         memberBorrowedBooks.get(memberName).remove(bookName);
         availableBooks.add(bookName);
         System.out.println(memberName + " has successfully returned " + bookName);
     } else {
         System.out.println(memberName + " didn't borrow " + bookName);
     }
 } */

/*  // Show the available books in the library
 public void showAvailableBooks() {
     System.out.println("Available Books:");
     for (String book : availableBooks) {
         System.out.println(book);
     }
 } */

/* //Show members of in the library
public void showMembers() {
   System.out.println("Library members:");
   for (String member : memberBorrowedBooks.keySet()) {
       System.out.println(member);
   }
} */