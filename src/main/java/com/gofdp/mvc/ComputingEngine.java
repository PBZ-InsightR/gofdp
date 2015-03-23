package com.gofdp.mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputingEngine extends JFrame implements Observer {

    private JPanel container = new JPanel();

    String[] tab_string = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "=", "C", "+", "-", "*", "/"};
    JButton[] tab_button = new JButton[tab_string.length];

    private JLabel screen = new JLabel();
    private Dimension dim = new Dimension(50, 40);
    private Dimension dim2 = new Dimension(50, 31);
    private Controller controller;

    public ComputingEngine(Controller controller) {
        this.setSize(240, 260);
        this.setTitle("Calculette");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        initComponent();
        this.controller = controller;
        this.setContentPane(container);
        this.setVisible(true);
    }

    private void initComponent() {
        Font police = new Font("Arial", Font.BOLD, 20);
        screen = new JLabel("0");
        screen.setFont(police);
        screen.setHorizontalAlignment(JLabel.RIGHT);
        screen.setPreferredSize(new Dimension(220, 20));

        JPanel operatorPanel = new JPanel();
        operatorPanel.setPreferredSize(new Dimension(55, 225));
        JPanel numberPanel = new JPanel();
        numberPanel.setPreferredSize(new Dimension(165, 225));
        JPanel screenPanel = new JPanel();
        screenPanel.setPreferredSize(new Dimension(220, 30));

        OperatorListener opeListener = new OperatorListener();

        for (int i = 0; i < tab_string.length; i++) {
            tab_button[i] = new JButton(tab_string[i]);
            tab_button[i].setPreferredSize(dim);

            switch (i) {
                case 11:
                    tab_button[i].addActionListener(opeListener);
                    numberPanel.add(tab_button[i]);
                    break;
                case 12:
                    tab_button[i].setForeground(Color.red);
                    tab_button[i].addActionListener(new ResetListener());
                    tab_button[i].setPreferredSize(dim2);
                    operatorPanel.add(tab_button[i]);
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    tab_button[i].setForeground(Color.red);
                    tab_button[i].addActionListener(opeListener);
                    tab_button[i].setPreferredSize(dim2);
                    operatorPanel.add(tab_button[i]);
                    break;
                default:
                    numberPanel.add(tab_button[i]);
                    tab_button[i].addActionListener(new NumberListener());
                    break;
            }
        }
        screenPanel.add(screen);
        screenPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        container.add(screenPanel, BorderLayout.NORTH);
        container.add(numberPanel, BorderLayout.CENTER);
        container.add(operatorPanel, BorderLayout.EAST);
    }

    class NumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.setNumber(((JButton) e.getSource()).getText());
        }
    }

    class OperatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.setOperator(((JButton) e.getSource()).getText());
        }
    }

    class ResetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            controller.reset();
        }
    }

    @Override
    public void update(String str) {
        screen.setText(str);
    }
}