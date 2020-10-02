package movables;

public class MovableRectangle implements Movable {
	private MovablePoint topLeft = new MovablePoint(0, 0, 1, 1);
	private MovablePoint bottomRight = new MovablePoint(1, 1, 1, 1);

	public MovableRectangle() {}

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	public void moveUp() {
		this.topLeft.y += this.topLeft.ySpeed;
		this.bottomRight.y += this.bottomRight.ySpeed;
	}

	public void moveDown() {
		this.topLeft.y -= this.topLeft.ySpeed;
		this.bottomRight.y -= this.bottomRight.ySpeed;
	}

	public void moveLeft() {
		this.topLeft.x -= this.topLeft.xSpeed;
		this.bottomRight.x -= this.bottomRight.xSpeed;
	}

	public void moveRight() {
		this.topLeft.x += this.topLeft.xSpeed;
		this.bottomRight.x += this.bottomRight.xSpeed;
	}

	@Override
	public String toString() {
		return "Entity: MovableRectangle, x1: " + this.topLeft.x + ", y1: " + this.topLeft.y +
				", x2: " + this.bottomRight.x + ", y2: " + this.bottomRight.y;
	}
}