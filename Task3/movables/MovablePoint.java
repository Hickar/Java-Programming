package movables;

public class MovablePoint implements Movable {
	protected int x = 0, y = 0, xSpeed = 1, ySpeed = 1;

	public MovablePoint() {}

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public void moveUp() {
		this.y += this.ySpeed;
	}

	public void moveDown() {
		this.y -= this.ySpeed;
	}

	public void moveLeft() {
		this.x -= this.xSpeed;
	}

	public void moveRight() {
		this.x += this.xSpeed;
	}

	@Override
	public String toString() {
		return "Entity: MovablePoint, x: " + this.x + ", y: " + this.y;
	}
}
