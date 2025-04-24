import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class GameGUI {
    private JFrame frame;

    public GameGUI() {
        // Initialize the JFrame
        frame = new JFrame("UwU Syntax Error Love Overflow UwU");
        frame.setSize(800, 800);  // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use absolute positioning


         // Set up background color or image
         JPanel backgroundPanel = new JPanel();
         backgroundPanel.setBackground(new Color(255, 182, 193)); // Light pink color
         backgroundPanel.setBounds(0, 0, 800, 800); // Cover the entire frame
         frame.setContentPane(backgroundPanel);

        //Title
        JLabel titleLabel = new JLabel("Syntax Error Love Overflow", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 50)); // Customize the font
        titleLabel.setForeground(Color.WHITE); // Set text color
        titleLabel.setBounds(0, 100, 800, 100); // Position the title
        frame.add(titleLabel);

        // Subtitle Label with a playful font
        JLabel subtitleLabel = new JLabel("A Romantic Adventure Awaits!", SwingConstants.CENTER);
        subtitleLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 30)); // Use Comic Sans for playfulness
        subtitleLabel.setForeground(Color.WHITE);
        subtitleLabel.setBounds(0, 200, 800, 50);
        frame.add(subtitleLabel);
        
        // Add components to the background panel instead of the frame
        backgroundPanel.setLayout(null); // Use absolute positioning for the panel

        //Center the button (800 - x)/2 
        // Add a "Start Game" button
        customButton startButton = new customButton(
            "Start Game!", 
            300, 375, 200, 50, 
            e -> {
                backgroundPanel.removeAll();
                JLabel label = new JLabel("Game Started!", SwingConstants.CENTER);
                label.setBounds(200, 375, 400, 50);
                backgroundPanel.add(label);
        
                // Add a "Somewhere" button
                customButton tellMeMoreButton = new customButton(
                    "Tell more about you!", 
                    100, 561, 200, 50, 
                    event -> {
                        backgroundPanel.removeAll();
                        JLabel somewhereLabel = new JLabel("more about char", SwingConstants.CENTER);
                        somewhereLabel.setBounds(200, 375, 400, 50);
                        backgroundPanel.add(somewhereLabel);
                        backgroundPanel.revalidate();
                        backgroundPanel.repaint();
                    }
                );

                customButton diffCharButton = new customButton(
                    "New character greeting", 
                    500, 561, 200, 50, 
                    event -> {
                        backgroundPanel.removeAll();
                        JLabel somewhereLabel = new JLabel("New character!", SwingConstants.CENTER);
                        somewhereLabel.setBounds(200, 375, 400, 50);
                        backgroundPanel.add(somewhereLabel);
                        backgroundPanel.revalidate();
                        backgroundPanel.repaint();
                    }
                );
                backgroundPanel.add(tellMeMoreButton);
                backgroundPanel.add(diffCharButton);

                backgroundPanel.revalidate();
                backgroundPanel.repaint();
                    }
                );
                backgroundPanel.add(startButton);





        // Set the window to be visible
        frame.setVisible(true);
    }
}