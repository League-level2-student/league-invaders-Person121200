import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject{
	int x;
	int y;
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	public Rocketship(int x, int y, int width, int height, int speed, boolean isActive) {
		super(x, y, width, height, speed, isActive);
		this.x =x;
		this.y = y;
		
		if (needImage) {
		    loadImage ("rocket.png");
		}
		if(needImage) {
			loadImage ("alien.png");
		}
		if(needImage) {
			loadImage ("bullet.png");
		}

	

		
		speed = 10;
	}
	public void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}


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
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
	public Projectile getProjectile() {
        return new Projectile(x+width/2, y, 10, 10, x, true);
} 


}
