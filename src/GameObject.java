import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	int speed = 0;
	Rectangle collisionBox;
	boolean isActive = true;
	public BufferedImage image;
	public boolean needImage = true;
	public boolean gotImage = false;	
	public GameObject(int x, int y, int width, int height, int speed, boolean isActive){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = speed;
		this.isActive = isActive;
		collisionBox = new Rectangle(x, y, width, height);
	}
	
	public void update() {
        collisionBox.setBounds(x, y, width, height);
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
	
}
