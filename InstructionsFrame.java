import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class InstructionsFrame extends JFrame{
	
	public InstructionsFrame(){
		
		setTitle("Instructions");
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setContentPane(new JLabel(new ImageIcon("E:\\Computer Science\\- Final Project\\Instructions.png")));
		setSize(599,599);
		setSize(600,600);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}