//Illustration of KeyBoard event handling
import java.awt.*;
import java.awt.event.*;

public class IllustrationOfKeyBoardEventHandling extends Frame implements KeyListener {
    Label l;
    TextArea ta;

    IllustrationOfKeyBoardEventHandling() {
        // Setting frame properties
        setSize(400, 400);
        setLayout(null);

        // Creating and positioning the Label
        l = new Label("Enter Text");
        l.setBounds(50, 50, 100, 30);
        add(l);

        // Creating and positioning the TextArea
        ta = new TextArea(80, 40);
        ta.setBounds(50, 100, 300, 200);
        add(ta);

        // Adding KeyListener to the TextArea
        ta.addKeyListener(this);

        // Adding WindowListener to handle the close button
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the frame
                System.exit(0); // Terminate the application
            }
        });

        // Make the frame visible
        setVisible(true);
    }

    // Handling keyPressed event
    public void keyPressed(KeyEvent e) {
        System.out.println("Key is pressed: " + e.getKeyChar() + " Pressed, Code: " + e.getKeyCode());
    }

    // Handling keyReleased event
    public void keyReleased(KeyEvent e) {
        System.out.println("Key is released: " + e.getKeyChar() + " Released, Code: " + e.getKeyCode());
    }

    // Handling keyTyped event
    public void keyTyped(KeyEvent e) {
        System.out.println("Key is typed: " + e.getKeyChar() + " Typed");
    }

    // Main method
    public static void main(String[] args) {
        new IllustrationOfKeyBoardEventHandling();
    }
}
