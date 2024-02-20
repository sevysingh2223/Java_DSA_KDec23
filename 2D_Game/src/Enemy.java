import javax.swing.ImageIcon;
public class Enemy extends Sprites{
	
	public Enemy(int new_x, int updated_speed){
		this.x = new_x;
		y = 10;
		width = 100;
		height = 100;
		this.speed = updated_speed;
		image = new ImageIcon(Player.class.getResource("spider.gif"));
	}

	public void move() {
		if(y>450) {
			y =10;
		}
		y = y + speed;
	}
}
