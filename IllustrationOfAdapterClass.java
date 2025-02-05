// Write a java program for illustration of a fully functional adapter class
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IllustrationOfAdapterClass {
    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("Adapter Class Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel to display messages
        JLabel label = new JLabel("Perform a mouse action!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        label.setOpaque(true);
        label.setBackground(Color.LIGHT_GRAY);

        // Add a MouseAdapter to handle mouse events
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
                label.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered");
                label.setBackground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited");
                label.setBackground(Color.LIGHT_GRAY);
            }
        });

        // Add the label to the frame
        frame.add(label);
        frame.setVisible(true);
    }
}
