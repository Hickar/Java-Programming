import Dogs.*;

public class DogTest {
	public DogTest() {
		Labrador labrador1 = new Labrador();
		System.out.println(labrador1);

		Labrador labrador2 = new Labrador("Ceramic", 4);
		System.out.println(labrador2);
		labrador2.bark();

		CockerSpaniel cocker1 = new CockerSpaniel("Amy", 1, "Gold", "small");
		cocker1.bark();
		System.out.println(cocker1);

		CockerSpaniel cocker2 = new CockerSpaniel("Pixel", 5);
		cocker2.setAge(7);
		System.out.println(cocker2.getAge());
		System.out.println(cocker2);

		Beagle beagle1 = new Beagle("Artamon", 10);
		beagle1.bark();
		System.out.println(beagle1);

		BeagleDescendent beagleDescendent = new BeagleDescendent("Terry", 13);
		beagleDescendent.bark();
		beagleDescendent.derivedClassMethod();
	}
}
