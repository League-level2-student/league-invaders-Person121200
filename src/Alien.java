import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;

public class Alien extends GameObject{
	int x;
	int y;
	int width;
	int height;
	int speed;
	boolean isActive;
	boolean needImage = true;
	Image image;
	boolean gotImage = false;
	
	public Alien(int x, int y, int width, int height, boolean isActive) {
		super(x, y, width, height, height, isActive);
		if(needImage) {
			loadImage ("alien.png");
			needImage = false;
		}
	}
	public void update() {
		y+=speed;
		super.update();

	}
	public void draw(Graphics g) {
	
	
	if (gotImage) {
		g.drawImage(image, x, y, width, height, null);
	} else {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
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
