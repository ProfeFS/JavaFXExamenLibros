package edu.examen.javafx.modelo;

public class Book {
	private int id;
	private String title;
	private String author;
	private String isbn;
	private String category;
	private boolean available;

	// Constructor
	public Book(int id, String title, String author, String isbn, String category, boolean available) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.category = category;
		this.available = available;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", category="
				+ category + ", available=" + available + "]";
	}
	
	

}
