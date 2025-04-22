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

        // Create and position the button
        JButton button = new JButton("Click Me!");
        button.setBounds(300, 600, 200, 50); // x, y, width, height
        frame.getContentPane().add(button);

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