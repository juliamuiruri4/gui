import java.awt.*;
import javax.swing.*;
public class PracticeOnFrame {
public static void main(String[]args) {
	JFrame frame=new JFrame("My Practice");
	JButton button=new JButton("OK");
	frame.setSize(500,500);
	frame.setLocation(100,100);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(button);
	
}
}
