import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject{
	boolean up;
	boolean down;
	boolean right;
	boolean left;
	public Rocketship(int x, int y, int width, int height, int speed, boolean isActive) {
		super(x, y, width, height, speed, isActive);

		
		if (needImage) {
		    loadImage ("rocket.png");
		    needImage = false;
		}



	}
//	public void draw(Graphics g) {
//		if (gotImage) {
//			g.drawImage(image, x, y, width, height, null);
//		} else {
//			g.setColor(Color.BLUE);
//			g.fillRect(x, y, width, height);
//		}


//	}
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
	public void update() {
		if(left == true) {
			left();
		}
		if(right == true) {
			right();
		}
		if(up == true) {
			up();
		}
		if(down == true) {
			down();
		}
		super.update();
	}

	public Projectile getProjectile() {
        return new Projectile(x+width/2, y, 10, 10, 20, true);
} 


}
