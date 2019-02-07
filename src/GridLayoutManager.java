//grid layout is used to arrange components  in a rectangular grid and all the components have identical sizes
//the manager automatically stretches or compresses the components so as to fill the entire space of the container
import java.awt.*;
import javax.swing.*;
//the keyword 'extends' is to inherit classes from the JFrame package
public class GridLayoutManager extends JFrame{
	//the contructor
	public GridLayoutManager() {
		Container container=getContentPane();
		//a grid layout constructor with r(number of rows),c(number of columns), hgap and vgap
		container.setLayout(new GridLayout(4,2,20,20));
		for(int t=1;t<10;t++) {
			//Addition of 9 components to the container
			container.add(new JButton("Button "+t));
		}
		
	}

public static void main(String[]args) {
	GridLayoutManager frame=new GridLayoutManager();
	frame.setVisible(true);	
	frame.setSize(800,600);
	frame.setLocation(100,100);
	frame.setTitle("Grid Layout Example");
	
}
}