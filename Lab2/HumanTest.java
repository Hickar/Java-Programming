import Human.*;

public class HumanTest {
	public static void main(String[] args) {
		System.out.println("HumanTest");

		Human human1 = new Human("male", "white", 21);
		System.out.println("human1: " + human1);
		human1.info();
		System.out.println();

		Human human2 = new Human("female", "black", 30);
		System.out.println("human2: " + human2);
	}
}
