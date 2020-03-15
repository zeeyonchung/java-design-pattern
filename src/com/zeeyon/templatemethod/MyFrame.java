package com.zeeyon.templatemethod;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "Good night";
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Design Pattern");
    }
}
