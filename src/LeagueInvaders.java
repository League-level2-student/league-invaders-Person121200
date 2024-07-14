import javax.swing.JFrame;

public class LeagueInvaders {
	static final int WIDTH = 500;
	static final int HEIGHT = 800;
	
	
	static JFrame frame;
	public static void main(String[] args) {
		LeagueInvaders leagueInvaders = new LeagueInvaders(frame, GamePanel.game);
	}
	private GamePanel game;
	LeagueInvaders(JFrame frame, GamePanel game){
		this.frame = frame;
		this.frame = new JFrame();
		this.game = game;
		this.game = new GamePanel(null, null, 0);
		
		setup();

	}
	public void setup() {
		frame.add(game);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
