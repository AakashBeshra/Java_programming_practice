import java.awt.*;
import java.awt.event.*;

public class FactorialCalculator1 extends Frame implements ActionListener {
    private Label l1, l2;
    private TextField tf1;
    private Button buttonCalculate;
    
    public FactorialCalculator1() {
        // Set frame properties
        setTitle("Factorial Calculator");
        setSize(400, 300);
        setLayout(null);

        // Input Label
        l1 = new Label("Enter a number:");
        l1.setBounds(50, 50, 120, 30);
        add(l1);

        // Input TextField
        tf1 = new TextField();
        tf1.setBounds(180, 50, 150, 30);
        add(tf1);

        // Calculate Button
        buttonCalculate = new Button("Calculate");
        buttonCalculate.setBounds(150, 100, 100, 30);
        buttonCalculate.addActionListener(this);
        add(buttonCalculate);

        // Result Label
        l2 = new Label("Result:");
        l2.setBounds(50, 150, 300, 30);
        add(l2);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        // Set frame visibility
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Get input number
            int number = Integer.parseInt(tf1.getText());

            if (number < 0) {
                l2.setText("Result: Factorial of negative numbers is undefined.");
            } else {
                // Compute factorial
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }

                // Display result
                l2.setText("Result: Factorial of " + number + " is " + factorial);
            }
        } catch (NumberFormatException ex) {
            l2.setText("Result: Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        new FactorialCalculator();
    }
}
