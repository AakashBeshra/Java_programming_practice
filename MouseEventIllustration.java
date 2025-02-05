import java.awt.*;
import java.awt.event.*;

public class MouseEventIllustration extends Frame {
    // Constructor to set up the window and mouse listeners
    public MouseEventIllustration() {
        // Add MouseListener to handle mouse click and press events
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered the Frame");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Exited the Frame");
            }
        });

        // Add MouseMotionListener to handle mouse movement and dragging
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse Moved to: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse Dragged to: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Set up the window properties
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventIllustration();  // Create the window and set up listeners
    }
}
