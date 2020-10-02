package task1;

public class Book {
	private int pageCount = 50;
	private String title, author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author, int pageCount) {
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}

	public String toString() {
		return "Book's title: " + this.title + ", author: " + this.author + ", page count: " + this.pageCount;
	}

	public String title() {
		return this.title;
	}

	public void title(String title) {
		this.title = title;
	}

	public String author() {
		return this.author;
	}

	public void author(String author) {
		this.author = author;
	}

	public int pageCount() {
		return this.pageCount;
	}

	public void pageCount(int pageCount) {
		this.pageCount = pageCount;
	}
}
