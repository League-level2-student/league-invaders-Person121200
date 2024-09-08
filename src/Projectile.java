import java.awt.Color;
import java.awt.Graphics;

import javax.imageio.ImageIO;

public class Projectile extends GameObject{

	
	public Projectile(int x, int y, int width, int height, int speed, boolean isActive) {
		super(x, y, width, height, speed, isActive);

		if(needImage) {
			loadImage ("bullet.png");
			needImage = false;
		}
	}

//		public void draw(Graphics g) {
//			if (gotImage) {
//				g.drawImage(image, x, y, width, height, null);
//			} else {
//				g.setColor(Color.RED);
//				g.fillRect(x, y, width, height);
//			}
//	}
	
	public void update() {
		y-=speed;
		super.update();
	}


	

}
