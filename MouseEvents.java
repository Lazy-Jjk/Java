import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Frame implements MouseListener {
    Label label;

    public MouseEvents() {
        label = new Label("Click or move mouse");
        label.setBounds(50, 100, 200, 30);
        add(label);

        addMouseListener(this);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseEvents();
    }
}