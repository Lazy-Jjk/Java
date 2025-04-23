import javax.swing.*;
import java.awt.event.*;

public class MouseEventDemo extends JFrame {
    private JTextArea textArea;
    
    public MouseEventDemo() {
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        textArea = new JTextArea();
        textArea.setEditable(false);
        add(textArea);
        
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) { textArea.append("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")\n"); }
            public void mousePressed(MouseEvent e) { textArea.append("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")\n"); }
            public void mouseReleased(MouseEvent e) { textArea.append("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")\n"); }
            public void mouseEntered(MouseEvent e) { textArea.append("Mouse Entered the window\n"); }
            public void mouseExited(MouseEvent e) { textArea.append("Mouse Exited the window\n"); }
        });
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseEventDemo().setVisible(true));
    }
} 