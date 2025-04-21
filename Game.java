import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Game {
    public static void main(String[] args) {
        JFrame frame = new JFrame("UwU Syntax Error Love Overflow UwU");
        frame.setSize(800, 800);  // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                JLabel label = new JLabel("Button Clicked!", SwingConstants.CENTER);
                frame.getContentPane().add(label);
                frame.revalidate();
                frame.repaint();
            }
        });
        // Add the button to the frame's content pane
        frame.getContentPane().add(button);

        // Set the window to be visible
        frame.setVisible(true);



        //VVV Create different NPCs VVV (TEMP FORMAT)
        NPC brad = new love("brad", -100, "a");
        //System.out.println(brad);
        //System.out.println(" ");
        NPC jasper = new NPC("jasper", 100, "b");
        //System.out.println(jasper);
        //System.out.println(" ");
        NPC cedar = new NPC("cedar", 100, "c");
       // System.out.println(cedar);
        //System.out.println(" ");
        NPC benX = new NPC("benX", 100, "d");
        //System.out.println(benX);
        //System.out.println(" ");
        //^^^ Create different NPCs ^^^ (TEMP FORMAT)

        brad.setloveStat(75);

        System.out.println(brad);
        

    }
}