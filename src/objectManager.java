import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class objectManager implements ActionListener{
	Rocketship rocket;
	Random ran = new Random();
	 ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	 ArrayList<Alien> aliens = new ArrayList<Alien>();
	objectManager(Rocketship rocket){
		this.rocket = rocket;
		
	}
	public void addProjectile(Projectile projectile){
		projectiles.add(projectile);
	}
	public void addAlien() {
		aliens.add(new Alien(ran.nextInt(LeagueInvaders.WIDTH),0,50,50, true));
 
	}
	public void update(){
		for(int i = 0; i<aliens.size(); i++) {
			aliens.get(i).update();
			System.out.println(aliens.get(i).y);
			aliens.get(i).isActive = false;
		}
	}
	public void draw(Graphics g) {
		rocket.draw(g);
		for(int i = 0; i < aliens.size(); i++) {
			aliens.get(i).draw(g);
			projectiles.get(i).draw(g);
				
			
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
