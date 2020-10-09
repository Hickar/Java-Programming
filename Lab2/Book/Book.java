package Book;

public class Book {
	private String title = "N/A",
			author = "N/A",
			pageCount = "N/A",
			yearWritten = "N/A";

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author, String pageCount) {
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}

	public Book(String title, String author, String pageCount, String yearWritten) {
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
		this.yearWritten = yearWritten;
	}

	public String toString() {
		return "Book.Book's title: " + title + ", author: " + author + ", page count: " + pageCount +
				", year written: " + yearWritten;
	}

	public String title() {
		return title;
	}

	public void title(String title) {
		this.title = title;
	}

	public String author() {
		return author;
	}

	public void author(String author) {
		this.author = author;
	}

	public String pageCount() {
		return pageCount;
	}

	public void pageCount(String pageCount) {
		this.pageCount = pageCount;
	}

	public void yearWritten(String yearWritten) {
		this.yearWritten = yearWritten;
	}

	public String yearWritten() {
		return yearWritten;
	}

}