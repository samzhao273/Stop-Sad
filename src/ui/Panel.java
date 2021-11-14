package ui;

import model.Phrases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    private JLabel positivePhrase;
    private JButton button;


    public Panel() {
        button = new JButton("(: HAPPY BUTTON :)");
        positivePhrase = new JLabel("");
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.setLayout(new GridLayout(0, 1));
        this.add(button);
        this.add(positivePhrase);
        button.addActionListener(new buttonListener());


    }

    class buttonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Phrases phrases = new Phrases();
            positivePhrase.setText(phrases.generatePhrase());

        }
    }
}
