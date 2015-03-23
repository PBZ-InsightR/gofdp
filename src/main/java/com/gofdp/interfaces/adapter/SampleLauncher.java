package com.gofdp.interfaces.adapter;

import javax.swing.*;
import java.awt.event.WindowEvent;

class SampleLauncher extends JFrame {

    public SampleLauncher() {
        setSize(200, 200);
        setVisible(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new SampleLauncher();
    }

}