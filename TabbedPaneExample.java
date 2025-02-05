import javax.swing.*;

public class TabbedPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TabbedPane Example");

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("This is Tab 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("This is Tab 2"));

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);

        frame.add(tabbedPane);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
