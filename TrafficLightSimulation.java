// Write a Java application for traffic light simulator
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightSimulation extends JFrame implements ActionListener {
    private JRadioButton redButton, yellowButton, greenButton;
    private JPanel lightPanel;

    public TrafficLightSimulation() {
        // Frame title and layout
        setTitle("Traffic Light Simulation");
        setLayout(new BorderLayout());
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel to display the traffic light
        lightPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw the traffic light circles
                g.setColor(Color.BLACK);
                g.fillRect(100, 50, 100, 250); // Traffic light box

                g.setColor(redButton.isSelected() ? Color.RED : Color.GRAY);
                g.fillOval(125, 70, 50, 50); // Red light

                g.setColor(yellowButton.isSelected() ? Color.YELLOW : Color.GRAY);
                g.fillOval(125, 140, 50, 50); // Yellow light

                g.setColor(greenButton.isSelected() ? Color.GREEN : Color.GRAY);
                g.fillOval(125, 210, 50, 50); // Green light
            }
        };

        // Radio buttons for the traffic light options
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Add action listeners to the buttons
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        // Panel for radio buttons
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(redButton);
        controlPanel.add(yellowButton);
        controlPanel.add(greenButton);

        // Add panels to the frame
        add(lightPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        // Default selection
        redButton.setSelected(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Repaint the light panel when a radio button is selected
        lightPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TrafficLightSimulation frame = new TrafficLightSimulation();
            frame.setVisible(true);
        });
    }
}
