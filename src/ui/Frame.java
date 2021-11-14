package ui;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        this.setTitle("Stop Sad!");
        ImageIcon image = new ImageIcon("image.jpg");
        super.setIconImage(image.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500,200);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.green);

    }
}
