package ball;

public class TestBall {
	public static void init() {
		Ball ball = new Ball();
		ball.setXY(1.5, 8.5);
		System.out.println(ball);

		Ball ball2 = new Ball(2,5);
		ball2.move(0, 0.35);
		System.out.println(ball2);

		Ball ball3 = new Ball();
		System.out.println(ball3);
	}
}
