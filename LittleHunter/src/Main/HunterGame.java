package Main;

import javax.swing.JFrame;

public class HunterGame 
{
	public static void main (String[] args)
	{
		//The main method is below. Currently, the MainPanel class extends JPanel and contains
		//the main components of the programme (a basic game).
		//I want to create a new panel to the right of the game.
		JFrame window = new JFrame ("Little Hunter");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		//If the parameter is "false" then the user cannot re-size the frame;
		window.pack();
		window.setVisible(true);
		//I click next button I want to show next frame and hide current frame;
	}
}
