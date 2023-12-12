package View;
import javax.swing.JFrame;
import Controller.GameController;
import Model.Main;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomePage extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WelcomePage(GameController controller) {
        // JFrame setup
        setTitle("Welcome to the Game");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Start button
        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
					controller.startGame();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });

        this.add(startButton);
    }

    public static void main(String[] args) {
        Main mainModel = new Main();
        GameController controller = new GameController(mainModel);
        WelcomePage welcomePage = new WelcomePage(controller);
        welcomePage.setVisible(true);
    }
}
