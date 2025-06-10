import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends Frame implements ActionListener {
    Label label;

    public MenuDemo() {
        MenuBar mb = new MenuBar();
        Menu menu = new Menu("Options");
        MenuItem mi1 = new MenuItem("Open");
        MenuItem mi2 = new MenuItem("Save");

        menu.add(mi1);
        menu.add(mi2);
        mb.add(menu);
        setMenuBar(mb);

        label = new Label("Menu Action Here");
        label.setBounds(100, 100, 200, 30);
        add(label);

        mi1.addActionListener(this);
        mi2.addActionListener(this);

        setSize(350, 200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Selected: " + e.getActionCommand());
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}