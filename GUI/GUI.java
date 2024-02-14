import javax.swing.JFrame;

public class GUI {

    GUI(){
        // Create the frame.
        JFrame frame = new JFrame();
        frame.setSize(1200, 600);
        frame.setTitle("Game");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Board());
    }

    public static void main(String[] args) {
        GUI obj = new GUI();
    }
}