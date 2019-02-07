import java.awt.*;
import javax.swing.*;
public class PracticeOnFlowLayout extends JFrame {
	public PracticeOnFlowLayout() {
		Container container= getContentPane();
		container.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		for(int j=1;j<=5;j++) {
			container.add(new JButton("Button"+j));
		}
	}
	public static void main(String[]args) {
	PracticeOnFlowLayout Frame=new PracticeOnFlowLayout();
	Frame.setTitle("My Practice");
	Frame.setVisible(true);
	Frame.setSize(600,550);
	Frame.setLocation(100,100);
	
	}

}
