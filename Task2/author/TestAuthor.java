package author;

public class TestAuthor {
	public static void init() {
		Author author = new Author("Philip Dick", "electric@sheep.neuronet", 'm');
		System.out.println(author);

		Author author2 = new Author("Agatha Christie", "crime@mystery.you", 'f');
		System.out.println(author2);

		Author author3 = new Author("Satoshi Nakamoto", "crypto@money.now", 'u');
		System.out.println(author3);
	}
}
