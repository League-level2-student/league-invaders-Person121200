import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.MenuContainer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	static JPanel game;
    final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int x =250;
    int y = 700;
    int width = 50;
    int height = 50;
    int currentState = MENU;
    Font titleFont;
    Font subFont;
    Font superFont;
    Timer frameDraw;
    Rocketship rocket = new Rocketship(x, y, width, height, 20, true);
    GamePanel(String fontType, Font fontStylization, int fontSize, Timer frameDraw){
    	this.frameDraw = frameDraw;
		titleFont = new Font("Arial", Font.PLAIN, 48);
		subFont = new Font("Arial", Font.PLAIN, 20);
		superFont = new Font("Arial", Font.PLAIN, 21);
		frameDraw = new Timer(1000/60, this);
		frameDraw.start();
		

    }
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
	}
	
	void updateMenuState(){
		
	}
	void updateGameState(){
		
	}
	void updateEndState(){
		
	}
	void drawMenuState(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("LEAGUE INVADERS", 20, 150);
		
		g.setFont(subFont);
		g.setColor(Color.WHITE);
		g.drawString("Press ENTER to start", 150, 400);
		
		g.setFont(superFont);
		g.setColor(Color.WHITE);
		g.drawString("Press SPACE for instructions", 100, 600);
	}
	 void drawGameState(Graphics g){
		 
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	    rocket.draw(g);

		}
	 void  drawEndState(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Game Over", 20, 150);
		
		g.setFont(subFont);
		g.setColor(Color.YELLOW);
		g.drawString("You killed enemies", 150, 400);
		
		g.setFont(superFont);
		g.setColor(Color.YELLOW);
		g.drawString("Press ENTER to restart", 100, 600);
	 }
	public void actionPerformed(ActionEvent e) {
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END){
		    updateEndState();
		}
		repaint();	
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			
			if(currentState == END) {
				currentState = MENU;
			}	
			else {
				
				currentState++;
				
				}
			}
		if(currentState == GAME) {
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				rocket.left();
			}
			if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				rocket.right();
			}
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				rocket.up();
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				rocket.down();
			}
			
		}
	}
	

		
	
	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
            ).remove(KeyEvent.VK_UP);
	}
}
