package View;

import javax.swing.*;
import Controller.MainController;
import java.awt.*;

public class GamingGrid extends JFrame {
    private static final long serialVersionUID = 1L;

    public GamingGrid(MainController controller, String playerName) {
        setTitle("Domino Grid - " + playerName);
        setSize(800, 600); // Adjust the size as needed
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add your Domino grid components and logic here

        // Example: Display a label with the player's name
        JLabel nameLabel = new JLabel("Player: " + playerName);
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(nameLabel, BorderLayout.NORTH);

        // Example: Add other components or grid elements

        // You can add more components and logic based on your game requirements
    }
}
