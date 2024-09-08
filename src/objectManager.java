import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class objectManager implements ActionListener{
	Rocketship rocket;
	Random ran = new Random();
	int score = 0;
	 ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	 ArrayList<Alien> aliens = new ArrayList<Alien>();
	objectManager(Rocketship rocket){
		this.rocket = rocket;

		
	}
	public void addProjectile(Projectile projectile){
		projectiles.add(projectile);
	}
	public void getScore() {
		
	}
	public void addAlien() {
		aliens.add(new Alien(ran.nextInt(LeagueInvaders.WIDTH),0,50,50, 2, true));

 
	}
	public void update(Graphics g){
		for(Alien alien: aliens) {
			
//			System.out.println(aliens.get(i).y);
			if(alien.y> LeagueInvaders.HEIGHT) {
				alien.isActive=false;
				

			}
			alien.update();

		}
		for(Projectile projectile:projectiles) {
			
			if(projectile.y<0) {
				projectile.isActive = false;
				
				 
				}
			projectile.update();

			

			
			
			
		}
		rocket.update();
		checkCollision();
		purgeObjects();				

	}
	public void draw(Graphics g) {
		rocket.draw(g);
		for(Projectile projectile:projectiles) {
			projectile.draw(g);
		}
			
			for(Alien alien: aliens) {
//				System.out.println(aliens.get(i).y);
				alien.draw(g);
			}
				
			
				
			
		}
	public void checkCollision(){

		for(Alien alien: aliens) {
			for(Projectile projectile: projectiles) {
				if(projectile.collisionBox.intersects(alien.collisionBox)){ 

					alien.isActive= false;
					projectile.isActive = false;
					score+=1;
					
			}

				
				}
			if(rocket.collisionBox.intersects(alien.collisionBox)){ 
				rocket.isActive = false;
	
		}
		
		

			

				

 {
					
				}
			}
		}
				
			

		
	
	
	public void purgeObjects() {
		
		for(int i = 0; i < aliens.size(); i++) {
			if(aliens.get(i).isActive == false) {
				aliens.remove(i);
			}
		
		
		}
		for(int i = 0; i< projectiles.size(); i++) {
			if(projectiles.get(i).isActive == false) {
				projectiles.remove(i);
			}
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		addAlien();
		
	}
}
