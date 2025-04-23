import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorButtonDemo extends JFrame {
    private JPanel colorPanel;
    
    public ColorButtonDemo() {
        setTitle("Color Button Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        
        JButton redButton = new JButton("Red");
        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        
        add(buttonPanel, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);
        
        redButton.addActionListener(e -> colorPanel.setBackground(Color.RED));
        yellowButton.addActionListener(e -> colorPanel.setBackground(Color.YELLOW));
        blueButton.addActionListener(e -> colorPanel.setBackground(Color.BLUE));
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ColorButtonDemo().setVisible(true));
    }
} 