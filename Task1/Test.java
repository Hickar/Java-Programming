import task1.*;

public class Test {
	public static void main(String[] args) {
		Ball ball1 =  new Ball(2, 1, "white");
		System.out.println(ball1.toString());

		Ball ball2 = new Ball(5);
		System.out.println(ball2.toString());


		Dog dog = new Dog("Rex", 3);
		System.out.println(dog);
		System.out.println(dog.name() + "'s age in human years is " + dog.humanAge());

		Dog dog2 = new Dog("Fluffy");
		dog2.age(5);
		System.out.println(dog2);
		System.out.println(dog2.name() + "'s age in human years is " + dog2.humanAge());
		

		Book book = new Book("Snowcrash", "Neal Stephenson");
		System.out.println("The author of " + book.title() + " is " + book.author());
		System.out.println(book);

		Book book2 = new Book("Diamond Age", "Neal Stephenson");
		System.out.println(book2);
	}
}
