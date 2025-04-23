import javax.swing.*;
import java.awt.event.*;

public class KeyboardEventDemo extends JFrame {
    private JTextArea textArea;
    
    public KeyboardEventDemo() {
        setTitle("Keyboard Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        textArea = new JTextArea();
        textArea.setEditable(false);
        add(textArea);
        
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { textArea.append("Key Typed: " + e.getKeyChar() + "\n"); }
            public void keyPressed(KeyEvent e) { textArea.append("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n"); }
            public void keyReleased(KeyEvent e) { textArea.append("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n"); }
        });
        
        setFocusable(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KeyboardEventDemo().setVisible(true));
    }
} 