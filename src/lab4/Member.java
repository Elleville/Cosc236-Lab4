package lab4;

import java.util.ArrayList;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.
	private int id;
	private String name;
	// private borrowedbBooks DONE: implement collection of borrowed books
	private ArrayList<Book> borrowedBooks;
	
	// TODO: implement functionality of Member class

	public Member(int id, String name){
		this.id = id;
		this.name = name;
		borrowedBooks = new ArrayList<Book>();
	}

	public int getID(){
		return id;
	}

	public String getName(){
		return this.name;
	}

	public ArrayList<Book> getBooks(){
		return borrowedBooks;
	}

	public void addBook(Book b){
		borrowedBooks.add(b);
	}

	public void removeBook(Book b){
		if(borrowedBooks.contains(b)){
			borrowedBooks.remove(b);
		}else{
			System.out.println("Member has not borrowed the book: " + b.getTitle());
		}
	}
	
	public String toString() {
		return id + ": " + name;
	}

}
