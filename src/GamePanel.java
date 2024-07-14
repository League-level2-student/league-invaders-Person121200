import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	static GamePanel game;
    final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
    Font titleFont;
    Font subFont;
    Font superFont;
    
    
    GamePanel(String fontType, Font fontStylization, int fontSize){
		titleFont = new Font("Arial", Font.PLAIN, 48);
		subFont = new Font("Arial", Font.PLAIN, 20);
		superFont = new Font("Arial", Font.PLAIN, 21);
		

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
}
