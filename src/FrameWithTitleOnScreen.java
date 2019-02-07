//GRAPHICAL USER INTERFACE

//a program that displays a frame on the screen with the title 'My Frame'
//graphics packages that define GUI related classes
//Abstract Windowing Toolkit was the original java package that came with the first version of jdk
import java.awt.FlowLayout;
import javax.swing.*;
public class FrameWithTitleOnScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//a component is an object used to represent a screen element such as text field, button
//a panel is a container that cannot be displayed on its own but is used to organize other components
//GUI container is a component used to hold and organize other components
//containers can either be heavy weight(managed by the OS and java has no control over 
//eg. frame) or light weight(managed by java eg. panel)
//GUI component is an object that represents a screen element such as a button or a text field
		
//creating objects frame and button
JFrame frame= new JFrame("MY FRAME");
JButton button= new JButton("OK");
//JTextField text=new JTextField("");
//setting properties of the components
frame.setSize(500,500);
frame.setLocation(100,100);
//the set visible is mandatory
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//adding a component to a container
frame.add(button);
//frame.add(text);


	}

}
