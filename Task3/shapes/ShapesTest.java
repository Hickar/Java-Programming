package shapes;

public class ShapesTest {
	public static void init() {
		// Приведение объекта класса Circle к родительскому классу Shape
		Shape s1 = new Circle(5.5, "RED", false);
		System.out.println(s1);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		/*
			System.out.println(s1.getRadius());
			Строка выдаёт ошибку при компиляции из-за не имения метода getRadius
			у родительского класса Shape, к которому был приведён объект,
			изначально инициализированный как инстанция класса Circle
		*/

		Circle c1 = (Circle) s1;
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		/*
			Shape s2 = new Shape();
			Строка выше выдаёт ошибку при компиляции ввиду того,
			что мы не можем создать объект абстрактного класса
		*/

		Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		/*
			System.out.println(s3.getLength());
			Строка выдаёт ошибку, так как метода getLength не существует
			в абстрактном классе Shape
		*/

		// Приведение объекта родительского класса Shape к дочернему классу Rectangle
		Rectangle r1 = (Rectangle) s3;
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());

		// Приведение объекта дочернего класса Square к родительскому классу Shape
		Shape s4 = new Square(6.6);
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		/*
			System.out.println(s4.getSide());
			Выдаёт ошибку, так как метода getSide() не существует в абстрактном классе Shape
		*/

		Rectangle r2 = (Rectangle) s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		System.out.println(r2.getLength());
		/*
			System.out.println(r2.getSide());
			Выдаёт ошибку, так как getSide() – это метод дочернего класса Square, а не Rectangle
		*/

		// Приведение объекта класса Rectangle к дочернему классу Square
		Square sq1 = (Square) r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
	}
}
