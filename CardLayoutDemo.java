import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo extends Frame implements ActionListener {
    CardLayout cl;
    Panel cards;
    Button b1, b2;

    public CardLayoutDemo() {
        cl = new CardLayout();
        cards = new Panel();
        cards.setLayout(cl);

        cards.add("Card1", new Label("This is Card 1"));
        cards.add("Card2", new Label("This is Card 2"));

        b1 = new Button("Show Card 1");
        b2 = new Button("Show Card 2");
        b1.addActionListener(this);
        b2.addActionListener(this);

        add(cards, "Center");

        Panel p = new Panel();
        p.add(b1);
        p.add(b2);
        add(p, "South");

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) cl.show(cards, "Card1");
        else cl.show(cards, "Card2");
    }

    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}