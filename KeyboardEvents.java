import java.awt.*;
import java.awt.event.*;

public class KeyboardEvents extends Frame implements KeyListener {
    Label label;

    public KeyboardEvents() {
        label = new Label("Press any key...");
        label.setBounds(50, 100, 200, 30);
        add(label);

        addKeyListener(this);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyboardEvents();
    }
}