import java.awt.*;
import java.awt.event.*;

public class RGBScrollApp extends Frame implements AdjustmentListener {
    Scrollbar red, green, blue;
    Label label;

    public RGBScrollApp() {
        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);

        red.setBounds(100, 50, 150, 20);
        green.setBounds(100, 80, 150, 20);
        blue.setBounds(100, 110, 150, 20);

        label = new Label("Color Preview");
        label.setBounds(100, 150, 150, 30);

        add(red); add(green); add(blue); add(label);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

        setSize(400, 250);
        setLayout(null);
        setVisible(true);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        int r = red.getValue();
        int g = green.getValue();
        int b = blue.getValue();
        label.setForeground(new Color(r, g, b));
    }

    public static void main(String[] args) {
        new RGBScrollApp();
    }
}