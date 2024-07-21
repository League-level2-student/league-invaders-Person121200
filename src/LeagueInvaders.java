import javax.swing.JFrame;

public class LeagueInvaders {
	static final int WIDTH = 500;
	static final int HEIGHT = 800;
	
	GamePanel game;
	JFrame frame;
	
	public static void main(String[] args) {
		LeagueInvaders leagueInvaders = new LeagueInvaders(GamePanel.frame, GamePanel.game);
	}

	LeagueInvaders(JFrame frame, GamePanel game){
		this.frame = frame;
		
		this.game = game;
		

		setup();

	}
	public void setup() {
		this.frame = new JFrame();
		this.game = new GamePanel(null, null, 0, null);
		this.frame.add(game);
		this.frame.addKeyListener(game);
		this.frame.setSize(WIDTH, HEIGHT);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setVisible(true);
		
	}
	
}
