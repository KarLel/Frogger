import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Creates the first frame the player will see. Allows the user to 
 * choose between different actions;
 */
public class WelcomeFrame extends JFrame implements ActionListener{
	private JButton playButton;
	private JButton helpButton;
	private JButton scoreButton;
	private JButton creditButton;
	
	public WelcomeFrame(){
		playButton	 = new JButton("PLAY");
		helpButton	 = new JButton("HELP");
		scoreButton	 = new JButton("HIGH SCORES");
		creditButton = new JButton("CREDITS");
		
		playButton.setFont(new Font("Lucida Sans", Font.BOLD,36));
		helpButton.setFont(new Font("Lucida Sans", Font.BOLD,36));
		scoreButton.setFont(new Font("Lucida Sans", Font.BOLD,36));
		creditButton.setFont(new Font("Lucida Sans", Font.BOLD,36));
		
		playButton.setIcon(new ImageIcon("E:\\Computer Science\\- Final Project\\PlayButton.png"));
		helpButton.setIcon(new ImageIcon("E:\\Computer Science\\- Final Project\\HelpButton.png"));
		scoreButton.setIcon(new ImageIcon("E:\\Computer Science\\- Final Project\\ScoresButton.png"));
		creditButton.setIcon(new ImageIcon("E:\\Computer Science\\- Final Project\\CreditsButton.png"));
		
		playButton.addActionListener(this);
		helpButton.addActionListener(this);
		scoreButton.addActionListener(this);
		creditButton.addActionListener(this);
		
		setTitle("Frogger!");
		setSize(750, 750);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,2));
		
		add(playButton);
		add(helpButton);
		add(scoreButton);
		add(creditButton);	
		
		setVisible(true);
	}

	/**
	 * ActionEvent completes an action
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(playButton)){
		
		}
		if(e.getSource().equals(helpButton)){
			InstructionsFrame frame = new InstructionsFrame();
		}
		if(e.getSource().equals(scoreButton)){
			
		}
		if(e.getSource().equals(creditButton)){
			CreditsFrame frame = new CreditsFrame();
		}
	}
	
	public static void main(String args[]) {
    	WelcomeFrame frame = new WelcomeFrame();
	}	
}