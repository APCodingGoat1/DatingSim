import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * The customButton class extends JButton to create a button with custom dimensions, 
 * position, and an action listener. It simplifies the creation of buttons in the game.
 */
/**
 * The customButton class extends JButton to create a button with custom dimensions, 
 * position, and an action listener. It simplifies the creation of buttons in the game.
 */
public class customButton extends JButton {
    /**
     * Constructs a customButton with the specified text, position, size, and action listener.
     * 
     * @param text   The text to display on the button.
     * @param x      The x-coordinate of the button's position.
     * @param y      The y-coordinate of the button's position.
     * @param width  The width of the button.
     * @param height The height of the button.
     * @param action The action listener to handle button clicks.
    */
    public customButton(String text, int x, int y, int width, int height, ActionListener action) {
        super(text); // Set the button's text
        this.setBounds(x, y, width, height); // Set the button's position and size
        this.addActionListener(action); // Add the action listener
    }
    }
