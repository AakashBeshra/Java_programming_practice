import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Example");

        String[] columnNames = {"ID", "Name", "Age"};
        Object[][] data = {
            {1, "Alice", 25},
            {2, "Bob", 30},
            {3, "Charlie", 35}
        };

        JTable table = new JTable(data, columnNames);

        frame.add(new JScrollPane(table));
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
