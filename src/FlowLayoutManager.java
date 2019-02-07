//A layout manager organizes the way components are positioned in the container
//one advantage of using layout manager is that there is no need for absolute coordinates where each component is to be placed
/*1.Flow layout manager arranges the components left to right, top to bottom in the 
order they were entered in the container*/
//when the container is not wide enough to display all the components, the excess are placed in the next row
//a program that displays 9 buttons on the frame labeled button 1- button 9
import javax.swing.*;
import java.awt.*;
public class FlowLayoutManager extends JFrame{
public FlowLayoutManager() {
	Container container=getContentPane();
	//a constuctor reserves class resources like memory and it shares the same name as it's class
	/*flow layout constructor with align(alignment used by manager), hgap(horizontal gaps between components)
	and vgap(vertical gap between components)*/
	container.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));//align,hgap,vgap
	for(int i=1;i<10;i++) {
		container.add(new JButton("Button "+i));
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowLayoutManager Frame= new FlowLayoutManager();
     Frame.setTitle("Flow Layout Example");
     Frame.setSize(800,600);
     Frame.setLocation(100,100);
     Frame.setVisible(true);
     Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}

