import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
public class Board extends JPanel{
    BufferedImage bgImg;
    public Board(){
        showBg();
    }

    public void showBg(){
        URL image = Board.class.getResource("ganbg.jpg");
        try{
            bgImg =ImageIO.read(image);
        }
        catch(IOException e){
            System.out.println("Error reading the file ganebg.jpg");
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics brush){
        super.paintComponent(brush);
        brush.drawImage(bgImg,0,0,1200,600,null);
    }
}
