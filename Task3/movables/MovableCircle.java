package movables;

public class MovableCircle implements Movable {
	private int radius = 1;
	private MovablePoint center = new MovablePoint(0, 0, 1,1);

	public MovableCircle() {}

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	public void moveUp() {
		this.center.y += this.center.ySpeed;
	}

	public void moveDown() {
		this.center.y -= this.center.ySpeed;
	}

	public void moveLeft() {
		this.center.x -= this.center.xSpeed;
	}

	public void moveRight() {
		this.center.x += this.center.xSpeed;
	}

	@Override
	public String toString() {
		return "Entity: MovableCircle, x: " + this.center.x + ", y: " + this.center.y;
	}
}
