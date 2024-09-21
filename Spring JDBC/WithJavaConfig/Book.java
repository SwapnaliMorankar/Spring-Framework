package com.springjdbc.entities;

public class Book {
	
	private int ID;
	private String Bookname;
	private String Genre;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	
	@Override
	public String toString() {
		return "Book [ID=" + ID + ", Bookname=" + Bookname + ", Genre=" + Genre + "]";
	}
	
	

}
