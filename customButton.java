import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * The customButton class extends JButton to create a button with custom dimensions, 
 * position, and an action listener. It simplifies the creation of buttons in the game.
 */
public class customButton extends JButton {
    /**
     * Constructs a customButton with the specified text, position, size, and action listener.
    */
    public customButton(String text, int x, int y, int width, int height, ActionListener action) {
        super(text); // Set the button's text
        this.setBounds(x, y, width, height); // Set the button's position and size
        this.addActionListener(action); // Add the action listener
    }
    }
