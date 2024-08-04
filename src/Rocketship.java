import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{
	int x;
	int y;
	
	public Rocketship(int x, int y, int width, int height, int speed, boolean isActive) {
		super(x, y, width, height, speed, isActive);
		this.x =x;
		this.y = y;
		
		speed = 10;
	}
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
        g.fillRect(this.x, this.y, this.width, this.height);
	}
	public void left() {
		this.x-=speed;
	}
	public void right() {
		x+=speed;
	}
	public void down() {
		y+=speed;
	}
	public void up() {
		y-=speed;
	}

}
