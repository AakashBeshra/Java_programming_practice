import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticOperations extends JFrame implements ActionListener {

    // Declare JButtons and text fields
    JButton addButton, subButton, mulButton, divButton;
    JTextField tf1, tf2, tf3;

    public ArithmeticOperations() {
        // Initialize JButtons and text fields
        addButton = new JButton("Add");
        subButton = new JButton("Subtract");
        mulButton = new JButton("Multiply");
        divButton = new JButton("Divide");

        tf1 = new JTextField(25);
        tf2 = new JTextField(25);
        tf3 = new JTextField(25);
        tf3.setEditable(false); // Result field should not be editable

        // Set layout for the frame
        setLayout(new FlowLayout());

        // Add components to the frame
        add(new JLabel("Enter number 1:"));
        add(tf1);
        add(new JLabel("Enter number 2:"));
        add(tf2);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(new JLabel("Result:"));
        add(tf3);

        // Add action listeners to JButtons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        // Set JFrame properties
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Read the input numbers
            double num1 = Double.parseDouble(tf1.getText());
            double num2 = Double.parseDouble(tf2.getText());
            double result = 0;

            // Get the source of the event (which JButton was clicked)
            Object source = e.getSource();

            // Perform the corresponding arithmetic operation
            if (source == addButton) {
                result = num1 + num2;
            } else if (source == subButton) {
                result = num1 - num2;
            } else if (source == mulButton) {
                result = num1 * num2;
            } else if (source == divButton) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    tf3.setText("Error! Divide by 0");
                    return;
                }
            }

            // Display the result
            tf3.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            tf3.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new ArithmeticOperations();
    }
}
