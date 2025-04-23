import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBScrollbarDemo extends JFrame {
    private JScrollBar redScroll, greenScroll, blueScroll;
    private JPanel colorPanel;
    
    public RGBScrollbarDemo() {
        setTitle("RGB Color Mixer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        redScroll = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        greenScroll = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        blueScroll = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.BLACK);
        
        JPanel scrollPanel = new JPanel(new GridLayout(3, 1));
        scrollPanel.add(new JLabel("Red:")); scrollPanel.add(redScroll);
        scrollPanel.add(new JLabel("Green:")); scrollPanel.add(greenScroll);
        scrollPanel.add(new JLabel("Blue:")); scrollPanel.add(blueScroll);
        
        add(scrollPanel, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);
        
        AdjustmentListener listener = e -> updateColor();
        redScroll.addAdjustmentListener(listener);
        greenScroll.addAdjustmentListener(listener);
        blueScroll.addAdjustmentListener(listener);
    }
    
    private void updateColor() {
        colorPanel.setBackground(new Color(redScroll.getValue(), greenScroll.getValue(), blueScroll.getValue()));
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RGBScrollbarDemo().setVisible(true));
    }
} 