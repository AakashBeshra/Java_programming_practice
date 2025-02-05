import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArithmeticCalculator extends JFrame implements ActionListener {

    // Declare components
    JTextField num1Field, num2Field, resultField;
    JButton divideButton;

    public ArithmeticCalculator() {

        // Set up the JFrame window
        setTitle("Integer Division Calculator");
        setLayout(new GridLayout(4, 2, 5, 5));

        // Create and add labels and text fields
        add(new JLabel("Num1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Num2:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        // Create and add the Divide button
        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        add(divideButton);

        // Set JFrame properties
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Check if Divide button was clicked
        if (e.getSource() == divideButton) {
            try {
                // Parse input numbers
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                // Perform division and display result
                int result = num1 / num2;
                resultField.setText(String.valueOf(result));

            } catch (NumberFormatException ex) {
                // Handle invalid number format (non-integer input)
                JOptionPane.showMessageDialog(this, "Invalid input! Please enter valid integers.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException ex) {
                // Handle division by zero
                JOptionPane.showMessageDialog(this, "Error: Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        // Create and show the calculator window
        new ArithmeticCalculator();
    }
}
