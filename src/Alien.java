import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{
	int x;
	int y;
	int width;
	int height;
	int speed;
	boolean isActive;
	public Alien(int x, int y, int width, int height, boolean isActive) {
		super(x, y, width, height, height, isActive);
		this.x = x;
		this.y=y;
		this.width = width;
		this.height = height;
		this.isActive = isActive;

		}
	public void update() {
		y+=speed;
	}
	public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
	}

}
