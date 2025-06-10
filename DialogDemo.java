import java.awt.*;
import java.awt.event.*;

public class DialogDemo extends Frame {
    Dialog d;

    public DialogDemo() {
        Button b = new Button("Show Dialog");
        b.setBounds(100, 100, 100, 30);
        add(b);

        d = new Dialog(this, "Simple Dialog", true);
        d.setLayout(new FlowLayout());
        d.setSize(200, 100);
        d.add(new Label("This is a dialog box"));
        Button close = new Button("OK");
        close.addActionListener(e -> d.setVisible(false));
        d.add(close);

        b.addActionListener(e -> d.setVisible(true));

        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DialogDemo();
    }
}