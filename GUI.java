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



        JLabel titleLabel = new JLabel("Syntax Error Love Overflow", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 50)); // Customize the font
        titleLabel.setForeground(Color.WHITE); // Set text color
        titleLabel.setBounds(0, 100, 800, 100); // Position the title
        frame.add(titleLabel);

        // Create and position the button
        JButton button = new JButton("Click Me!");
        button.setBounds(300, 600, 200, 50); // x, y, width, height
        frame.getContentPane().add(button);

        // Subtitle Label with a playful font
        JLabel subtitleLabel = new JLabel("A Romantic Adventure Awaits!", SwingConstants.CENTER);
        subtitleLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 30)); // Use Comic Sans for playfulness
        subtitleLabel.setForeground(Color.WHITE);
        subtitleLabel.setBounds(0, 200, 800, 50);
        frame.add(subtitleLabel);
        

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();

                JLabel label = new JLabel("Button Clicked!", SwingConstants.CENTER);
                label.setBounds(200, 300, 400, 50); // Set bounds for the label
                frame.getContentPane().add(label);

                frame.revalidate();
                frame.repaint();
            }
        });

        // Set the window to be visible
        frame.setVisible(true);
    }
}