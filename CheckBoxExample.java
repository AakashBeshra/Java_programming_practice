import javax.swing.*;
import java.awt.*;
public class CheckBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox Example");
        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        checkBox1.addActionListener(e -> {
            if (checkBox1.isSelected()) {
                System.out.println("Option 1 selected");
            } else {
                System.out.println("Option 1 unselected");
            }
        });
        checkBox2.addActionListener(e -> {
            if (checkBox2.isSelected()) {
                System.out.println("Option 2 selected");
            } else {
                System.out.println("Option 2 unselected");
            }
        });
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}