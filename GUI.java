import java.awt.*;
import javax.swing.*;

class GameGUI {
    private JFrame frame;
    private JPanel backgroundPanel;
    private Dialogue dialogue;
    private int currentCharacterIndex;

    public GameGUI() {
        //Center the button (800 - x)/2


        // Initialize the JFrame
        frame = new JFrame("UwU Syntax Error Love Overflow UwU");
        frame.setSize(800, 800);  // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use absolute positioning


         // Set up background color or image
         backgroundPanel = new JPanel();
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
        dialogue = new Dialogue();

        if (currentCharacterIndex >= dialogue.getGreetingsAll().size() - 1) {
            currentCharacterIndex = -1; // Initialize the character index
        }
        customButton startButton = new customButton(
            "Start Game", 300, 375, 200, 50,
        e -> updateCharacterOptions()
    );
    backgroundPanel.add(startButton);

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
            JOptionPane.showMessageDialog(frame, "penis");
        }
    );
    backgroundPanel.add(settingsButton);

        // Set the window to be visible
        frame.setVisible(true);
    }

    private void updateCharacterOptions() {
        // Check if there are any characters left to display
        if (currentCharacterIndex >= dialogue.getGreetingsAll().size() - 1) {
            // If all characters have been shown, display a message or reset
            backgroundPanel.removeAll();
            JLabel endLabel = new JLabel("No more characters to meet!", SwingConstants.CENTER); //CHANGE LATER
            endLabel.setBounds(200, 375, 400, 50);
            backgroundPanel.add(endLabel);
    
            // Optionally, add a "Restart" button - CHANGE LATER
            customButton restartButton = new customButton(
                "Restart",
                300, 450, 200, 50,
                e -> {
                    currentCharacterIndex = -1; // Reset the character index
                    updateCharacterOptions(); // Restart the process
                }
            );
            backgroundPanel.add(restartButton);
    
            backgroundPanel.revalidate();
            backgroundPanel.repaint();
            return;
        }
        currentCharacterIndex++;

        // Get the current character's data
        String[] UIgreeting = dialogue.getGreetingsAll().get(currentCharacterIndex);
        String characterName = UIgreeting[0];
        String greeting = UIgreeting[1 + (int) (Math.random() * (UIgreeting.length - 1))]; // Random greeting

        backgroundPanel.removeAll();
        JLabel greetingLabel = new JLabel(characterName + ": " + greeting, SwingConstants.CENTER);
        greetingLabel.setBounds(200, 375, 400, 50);
        backgroundPanel.add(greetingLabel);

        // Add "Tell Me More" button
        customButton tellMeMoreButton = new customButton(
            "Tell me more about " + characterName,
            100, 561, 200, 50,
        e -> {
            tellmeMore();
        }
    );
    // Add "Meet a Different Character" button
    customButton diffCharButton = new customButton(
        "Meet a different character",
        500, 561, 200, 50,
        e -> updateCharacterOptions() // Move to the next character
    );

    backgroundPanel.add(tellMeMoreButton);
    backgroundPanel.add(diffCharButton);
    backgroundPanel.revalidate();
    backgroundPanel.repaint();
    }

    private void tellmeMore() {
        backgroundPanel.removeAll();
            //CREATE ANOTHER METhOD THAT GOES TO A DIFFERENT DIALOGUE OPTION
            JLabel moreCharLabel = new JLabel("More about ", SwingConstants.CENTER);
            moreCharLabel.setBounds(200, 375, 400, 50);
            backgroundPanel.add(moreCharLabel);
            backgroundPanel.revalidate();
            backgroundPanel.repaint();
    }
}


