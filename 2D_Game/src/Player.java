
import javax.swing.ImageIcon;
public class Player extends Sprites {
	
	public Player(){
		x = 20;
		y = 250;
		width = 200;
		height = 200;
		speed = 5;
		image = new ImageIcon(Player.class.getResource("dude2.gif"));
	}
	
	public void move() {
		if(x>1180) {
			x = 10;
		}
		x = x + speed;
	}
}
