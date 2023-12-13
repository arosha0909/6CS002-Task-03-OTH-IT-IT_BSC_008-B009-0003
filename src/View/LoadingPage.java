package View;

import javax.swing.*;
import Controller.MainController;
import Model.Main;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadingPage extends JFrame {
    private static final long serialVersionUID = 1L;

    public LoadingPage(MainController controller) {
        setTitle("Welcome to the Game");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Relax and Play");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        mainPanel.add(welcomeLabel, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel();
        JLabel nameLabel = new JLabel("Your Name:");
        JTextField nameField = new JTextField(20);
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        mainPanel.add(inputPanel, BorderLayout.CENTER);

        JButton startButton = new JButton("Let's Go");
        startButton.setBackground(new Color(30, 144, 255));
        startButton.setForeground(Color.WHITE);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String playerName = nameField.getText();
                    MainMenu mainMenu = new MainMenu(playerName);
                    mainMenu.setVisible(true);
                    dispose();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        mainPanel.add(startButton, BorderLayout.SOUTH);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoadingPage welcomePage = new LoadingPage(new MainController(new Main()));
                welcomePage.setVisible(true);
            }
        });
    }
}
