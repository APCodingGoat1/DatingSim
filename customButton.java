import java.awt.event.ActionListener;
import javax.swing.*;

public class customButton extends JButton {
    public customButton(String text, int x, int y, int width, int height, ActionListener action) {
        super(text); // Set the button's text
        this.setBounds(x, y, width, height); // Set the button's position and size
        this.addActionListener(action); // Add the action listener
    }
    }
