import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;

public class Alien extends GameObject{
	public Alien(int x, int y, int width, int height, int speed, boolean isActive) {
		super(x, y, width, height, speed, isActive);
		
		
		if(needImage) {
			loadImage ("alien.png");
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
	public void update() {
		y+=speed;
		
		super.update();
		
	}

 
	

}
