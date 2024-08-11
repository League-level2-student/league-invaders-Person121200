import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{
	int x;
	int y;
	int width;
	int height;
	int speed = 10;
	static boolean isActive;
	public Projectile(int x, int y, int width, int height, int speed, boolean isActive) {
		super(x, y, width, height, speed, isActive);
		this.x =x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = speed;
		this.isActive = isActive;
		}
	public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
	}
	public void update() {
		y-=speed;
	}

}
