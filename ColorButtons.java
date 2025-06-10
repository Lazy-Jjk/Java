import java.awt.*;
import java.awt.event.*;

public class ColorButtons extends Frame implements ActionListener {
    Button red, yellow, blue;

    public ColorButtons() {
        red = new Button("Red");
        yellow = new Button("Yellow");
        blue = new Button("Blue");

        red.setBounds(50, 50, 80, 30);
        yellow.setBounds(150, 50, 80, 30);
        blue.setBounds(250, 50, 80, 30);

        add(red); add(yellow); add(blue);

        red.addActionListener(this);
        yellow.addActionListener(this);
        blue.addActionListener(this);

        setSize(400, 200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) setBackground(Color.RED);
        else if (e.getSource() == yellow) setBackground(Color.YELLOW);
        else if (e.getSource() == blue) setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new ColorButtons();
    }
}