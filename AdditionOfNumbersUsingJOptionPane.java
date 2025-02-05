// Java program to add two numbers using JOptionPane Program 10
import javax.swing.JOptionPane;

class testing1 {
    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Enter the value of x: ");
        String y = JOptionPane.showInputDialog("Enter the value of y: ");
        
        // Parsing the input strings to integers
        int n1 = Integer.parseInt(x);
        int n2 = Integer.parseInt(y);
        
        // Calculating the sum
        int z = n1 + n2;
        
        // Displaying the result
        JOptionPane.showMessageDialog(null, "Result: " + z);
    }
}