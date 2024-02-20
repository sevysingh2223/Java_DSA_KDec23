import javax.swing.ImageIcon;

public class Player2 {
	int x , y , height, width;
	ImageIcon image;
	
	Player2(){
		x = 10;
		y = 400;
		width = 200;
		height = 250;
		image = new ImageIcon(Player2.class.getResource("dude2.gif"));
	}
}
