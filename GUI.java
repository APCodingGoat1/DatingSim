import java.awt.*;
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
        JLabel titleLabel = new JLabel("Array of Emotions", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 50)); // Customize the font
        titleLabel.setForeground(Color.WHITE); // Set text color
        titleLabel.setBounds(0, 100, 800, 100); // Position the title
        frame.add(titleLabel);

        // Subtitle Label with a playful font
        JLabel subtitleLabel = new JLabel("Of course I want to date my classmates!", SwingConstants.CENTER);
        subtitleLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 30)); // Use Comic Sans for playfulness
        subtitleLabel.setForeground(Color.WHITE);
        subtitleLabel.setBounds(0, 200, 800, 50);
        frame.add(subtitleLabel);
        
        // Add components to the background panel instead of the frame
        backgroundPanel.setLayout(null); // Use absolute positioning for the panel

        //DIALOGUE
        Dialogue dialogue = new Dialogue();



        //Center the button (800 - x)/2 
        // Add a "Start Game" button
        customButton startButton = new customButton(
            "Start Game", 
            300, 375, 200, 50, 
            e -> {
                backgroundPanel.removeAll();
                String greetingB = dialogue.greetingBrad();
                JLabel label = new JLabel(greetingB, SwingConstants.CENTER); // OUTPUT
                label.setBounds(200, 375, 400, 50);
                backgroundPanel.add(label);
        
                // Add a "tellMemore" button
                customButton tellMeMoreButton = new customButton(
                    "Tell me more about you!", 
                    100, 561, 200, 50, 
                    event -> {
                        backgroundPanel.removeAll();
                        JLabel moreCharLabel = new JLabel("more about char", SwingConstants.CENTER);
                        moreCharLabel.setBounds(200, 375, 400, 50);
                        backgroundPanel.add(moreCharLabel);
                        backgroundPanel.revalidate();
                        backgroundPanel.repaint();
                    }
                );

                customButton diffCharButton = new customButton(
                    "Meet a different character", 
                    500, 561, 200, 50, 
                    event -> {
                        backgroundPanel.removeAll();
                        String greetingN = dialogue.normGreeting();
                        JLabel newCharLabel = new JLabel(greetingN, SwingConstants.CENTER);
                        newCharLabel.setBounds(200, 375, 400, 50);
                        backgroundPanel.add(newCharLabel);
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

//IDEA: create a for loop that presents two options tell more and new char. if tell me more is pressed, it will 
//remove all and add a new label with the new dialogue. if new char is pressed, it will remove all and add a new label with the new dialogue.
                // Add a "Quit" button
                customButton quitButton = new customButton(
                    "Quit", 
                    300, 450, 200, 50, 
                    e -> System.exit(0)
                );
                backgroundPanel.add(quitButton);

                // Add a "Settings" button
                customButton settingsButton = new customButton(
                    "Settings", 
                    300, 525, 200, 50, 
                    e -> {
                        // Placeholder for settings action
                        JOptionPane.showMessageDialog(frame, "Settings are not available yet.");
                    }
                );
                backgroundPanel.add(settingsButton);



        // Set the window to be visible
        frame.setVisible(true);
    }
}