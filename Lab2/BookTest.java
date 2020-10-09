import Book.*;

public class BookTest {
	public static void main(String[] args) {
		System.out.println("BookTest");

		Book book = new Book("Snowcrash", "Neal Stephenson");
		System.out.println("The author of " + book.title() + " is " + book.author());
		System.out.println(book);
		System.out.println();

		Book book2 = new Book("S.N.U.F.F.", "Viktor Pelevin", "370", "2011");
		System.out.println("The " + book2.title() + " was written in " + book2.yearWritten());
		System.out.println(book2);
	}
}
