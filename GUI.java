import java.awt.*;
import javax.swing.*;

/**
 * The GameGUI class represents the graphical user interface for the dating simulation game.
 * It manages the main game window, character interactions, and user input.
 */

class GameGUI {
    private JFrame frame;
    private JPanel backgroundPanel;
    private Dialogue dialogue;
    private int currentCharacterIndex;
    private java.util.List<NPC> characters = new java.util.ArrayList<>(); // List of characters
    private java.util.List<Integer> availableIndices = new java.util.ArrayList<>();



    private void displayImage(String imagePath) {
        // Clear the panel
        backgroundPanel.removeAll();
    
        // Load the image
        ImageIcon imageIcon = new ImageIcon(imagePath); // Path to the image file
        JLabel imageLabel = new JLabel(imageIcon); // Create a JLabel with the image
    
        // Set the size and position of the image
        imageLabel.setBounds(200, 200, 400, 400); // Adjust the position and size as needed
    
        // Add the image to the panel
        backgroundPanel.add(imageLabel);
    
        // Refresh the panel
        backgroundPanel.revalidate();
        backgroundPanel.repaint();
    }


    public GameGUI() {
        characters.add(new NPC("Brad", 25));
        characters.add(new NPC("Jasper", 50));
        characters.add(new NPC("Cedar", 25));
        characters.add(new NPC("BenX", 25));
        characters.add(new NPC("Noah", 50));
        characters.add(new NPC("Steven", 25));
        characters.add(new NPC("Caden", 25));
        characters.add(new NPC("Rohan", 25));

           // Initialize the list of available indices
        for (int i = 0; i < characters.size(); i++) {
        availableIndices.add(i);
        }

        
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

        //Center the button (800 - x)/2 
        
        
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
    

        // Set the window to be visible
        frame.setVisible(true);
    }


    private void updateCharacterOptions() {

        if (availableIndices.isEmpty()) {
        // Reset the list with all indices
        for (int i = 0; i < characters.size(); i++) {
            availableIndices.add(i);
        }
        System.out.println("All characters have been shown. Resetting the list.");
    }

        int randomIndex = (int) (Math.random() * availableIndices.size());
        currentCharacterIndex = availableIndices.get(randomIndex);
        availableIndices.remove(randomIndex); // Remove the index to avoid repetition

        // Debugging output
        System.out.println("Randomly selected character index: " + currentCharacterIndex);
        System.out.println("Remaining indices: " + availableIndices);


        //currentCharacterIndex = (int) (Math.random() * characters.size());
        //System.out.println("Current Character Index: " + currentCharacterIndex); // Debugging line
        NPC currentCharacter = characters.get(currentCharacterIndex);
        System.out.println("Current Character: " + currentCharacter.getName());

        if (currentCharacterIndex >= characters.size()) {
            currentCharacterIndex = 0; // Reset to the first character
        }

        // Check if there are any characters left to display
        if (currentCharacterIndex >= availableIndices.size() - 1) {
            // If all characters have been shown, display a message or reset
            backgroundPanel.removeAll();
            JLabel endLabel = new JLabel("No more characters to meet!", SwingConstants.CENTER);
            endLabel.setBounds(200, 375, 400, 50);
            backgroundPanel.add(endLabel);
    
            // Optionally, add a "Restart" button
            customButton restartButton = new customButton(
                "Restart",
                300, 450, 200, 50,
                e -> {
                    availableIndices.clear();
                    for (int i = 0; i < characters.size(); i++) {
                        availableIndices.add(i);
                    }
                    //currentCharacterIndex = -1; // Reset the character index
                    updateCharacterOptions(); // Restart the process
                }
            );
            backgroundPanel.add(restartButton);
    
            backgroundPanel.revalidate();
            backgroundPanel.repaint();
            return;
        }
        //currentCharacterIndex++;

        // Get the current character's data
        String[] UIgreetings = dialogue.getGreetingsAll().get(currentCharacterIndex);
        String characterName = UIgreetings[0];
        String greeting = UIgreetings[1 + (int) (Math.random() * (UIgreetings.length - 1))]; // Random greeting

        backgroundPanel.removeAll();

        String[] imagePaths = dialogue.getCharacterImages(characterName); // Get the image paths
        // Display the character's image
        String greetingImage = imagePaths[1];
        
        ImageIcon originalIcon = new ImageIcon(greetingImage); // Load the original image  
        Image scaledImage = originalIcon.getImage().getScaledInstance(600, 450, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage); // Create a new ImageIcon with the scaled image
        
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(100, 25, 600, 450); 
        backgroundPanel.add(imageLabel);

        //Character greeting
        JLabel greetingLabel = new JLabel(characterName + ": " + greeting, SwingConstants.CENTER);
        greetingLabel.setBounds(200, 475, 400, 50);
        backgroundPanel.add(greetingLabel);

        // Add "Tell Me More" button
        customButton tellMeMoreButton = new customButton(
            "Tell me more about " + characterName,
            100, 561, 200, 50,
        e -> {
            tellMeMoreButton();
        }
    );
    // Add "Meet a Different Character" button
    customButton diffCharButton = new customButton(
        "Meet a different character",
        500, 561, 200, 50,
        e -> updateCharacterOptions() // Move to the next character - recursion?
    );

    backgroundPanel.add(tellMeMoreButton);
    backgroundPanel.add(diffCharButton);
    backgroundPanel.revalidate();
    backgroundPanel.repaint();
    }



    private void tellMeMoreButton() {
        String[] UItellmeMore = dialogue.getTellMeMoreAll().get(currentCharacterIndex);
        String characterName = UItellmeMore[0];
        String tellmeMore = dialogue.getTellMeMoreData(characterName);

        backgroundPanel.removeAll();
        JLabel tellMeMoreLabel = new JLabel(characterName + ": " + tellmeMore, SwingConstants.CENTER);
        tellMeMoreLabel.setBounds(200, 475, 400, 50);
        backgroundPanel.add(tellMeMoreLabel);

        String[] imagePaths = dialogue.getCharacterImages(characterName); // Get the image paths
        // Display the character's image
        String tellMeMoreImage = imagePaths[2];
        
        ImageIcon originalIcon = new ImageIcon(tellMeMoreImage); // Load the original image  
        Image scaledImage = originalIcon.getImage().getScaledInstance(600, 450, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage); // Create a new ImageIcon with the scaled image
        
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(100, 25, 600, 450); 
        backgroundPanel.add(imageLabel);

        String[] options = dialogue.getTellMeMoreOptionsLabels(currentCharacterIndex); // Array of button labels
        String[] responses = dialogue.getTellMeMoreResponses(currentCharacterIndex); // Array of responses


        NPC currentCharacter = characters.get(currentCharacterIndex);

        //MINUES 10 NEGATIVE OPTION
        customButton option1 = new customButton(
        options[1],
        150, 550, 200, 50,
        e -> {
            currentCharacter.decloveStat(10); // Decrease love stat by 10
            System.out.println(currentCharacter.getName() + "'s love stat: " + currentCharacter.getloveStat() + "\nRelationship: " + currentCharacter.getRelationship());

            backgroundPanel.removeAll();
            JLabel response1Label = new JLabel(responses[1], SwingConstants.CENTER);
            response1Label.setBounds(200, 425, 400, 50);
            backgroundPanel.add(response1Label);
            backgroundPanel.revalidate();
            backgroundPanel.repaint();
        }
    );
        //MINUS 5 NEGATIVE OPTION
        customButton option2 = new customButton(
        options[2],
        450, 550, 200, 50,
        e -> {
            currentCharacter.decloveStat(5); // Decrease love stat by 10
            System.out.println(currentCharacter.getName() + "'s love stat: " + currentCharacter.getloveStat() + "\nRelationship: " + currentCharacter.getRelationship());

            backgroundPanel.removeAll();
            JLabel response2Label = new JLabel(responses[2], SwingConstants.CENTER);
            response2Label.setBounds(200, 375, 400, 50);
            backgroundPanel.add(response2Label);
            backgroundPanel.revalidate();
            backgroundPanel.repaint();
        }
    );
        //PLUS 10 POSTIVE OPTION
        customButton option3 = new customButton(
        options[3],
        150, 650, 200, 50,
        e -> {
            backgroundPanel.removeAll();
            currentCharacter.incloveStat(10); // Decrease love stat by 10
            System.out.println(currentCharacter.getName() + "'s love stat: " + currentCharacter.getloveStat() + "\nRelationship: " + currentCharacter.getRelationship());

            JLabel response3Label = new JLabel(responses[3], SwingConstants.CENTER);
            response3Label.setBounds(200, 375, 400, 50);
            backgroundPanel.add(response3Label);
            backgroundPanel.revalidate();
            backgroundPanel.repaint();
        }
    );
        //PLUS 5 POSITIVE OPTION
        customButton option4 = new customButton(
        options[4],
        450, 650, 200, 50,
        e -> {
            currentCharacter.incloveStat(5); // Decrease love stat by 10
            System.out.println(currentCharacter.getName() + "'s love stat: " + currentCharacter.getloveStat() + "\nRelationship: " + currentCharacter.getRelationship());

            backgroundPanel.removeAll();
            JLabel response4Label = new JLabel(responses[4], SwingConstants.CENTER);
            response4Label.setBounds(200, 375, 400, 50);
            backgroundPanel.add(response4Label);
            backgroundPanel.revalidate();
            backgroundPanel.repaint();
        }
    );



        backgroundPanel.add(option1);
        backgroundPanel.add(option2);
        backgroundPanel.add(option3);
        backgroundPanel.add(option4);

        backgroundPanel.revalidate();
        backgroundPanel.repaint();
    }







}