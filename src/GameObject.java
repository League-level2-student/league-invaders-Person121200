
public class GameObject {
	int x;
	int y;
	int width;
	int height;
	static int speed = 0;
	boolean isActive = true;
	public GameObject(int x, int y, int width, int height, int speed, boolean isActive){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		GameObject.speed = speed;
		this.isActive = isActive;
		
	}
	public void update() {
		
	}
}
